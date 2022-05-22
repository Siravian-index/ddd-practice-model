package com.zen.dddpracticemodel.waiter.usecases;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import com.zen.dddpracticemodel.waiter.commands.RemoveTable;
import com.zen.dddpracticemodel.waiter.events.TableAdded;
import com.zen.dddpracticemodel.waiter.events.TableRemoved;
import com.zen.dddpracticemodel.waiter.events.WaiterCreated;
import com.zen.dddpracticemodel.waiter.values.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class RemoveTableUseCaseTest {
    static String AR_ID = "fakeWaiterID";
    static String ENTITY_ID = "fakeTableID";

    @InjectMocks
    private RemoveTableUseCase useCase;

    @Mock
    private DomainEventRepository repository;

    @Test
    void removeOrderSuccessfully() {
        var waiterID = WaiterID.of(AR_ID);
        var tableID = TableID.of(ENTITY_ID);
        var command = new RemoveTable(waiterID, tableID);
        System.out.println(useCase);

        when(repository.getEventsBy(AR_ID)).thenReturn(List.of(
                new WaiterCreated(new Name("waiterName")),
                new TableAdded(tableID, new Size(4), new Location(LocationEnum.TERRACE))

        ));
        useCase.addRepository(repository);


//        when
        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(AR_ID)
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();
//        assert
        var event = (TableRemoved) events.get(0);
        assertEquals(ENTITY_ID, event.getTableID().value());
        verify(repository).getEventsBy(AR_ID);
    }
}