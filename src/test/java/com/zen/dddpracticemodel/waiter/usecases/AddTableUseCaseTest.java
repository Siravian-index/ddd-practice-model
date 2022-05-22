package com.zen.dddpracticemodel.waiter.usecases;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import com.zen.dddpracticemodel.waiter.commands.AddOrder;
import com.zen.dddpracticemodel.waiter.commands.AddTable;
import com.zen.dddpracticemodel.waiter.events.OrderAdded;
import com.zen.dddpracticemodel.waiter.events.TableAdded;
import com.zen.dddpracticemodel.waiter.events.WaiterCreated;
import com.zen.dddpracticemodel.waiter.values.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class AddTableUseCaseTest {
    static String AR_ID = "fakeWaiterID";
    @InjectMocks
    private AddTableUseCase useCase;

    @Mock
    private DomainEventRepository repository;

    @Test
    void addTaleToWaiterSuccessfully() {
        var waiterID = WaiterID.of(AR_ID);
        var size = new Size(4);
        var location = new Location(LocationEnum.OUTSIDE);
        var command = new AddTable(waiterID, size, location);

        when(repository.getEventsBy(AR_ID)).thenReturn(List.of(
                new WaiterCreated(new Name("waiterName"))
        ));
//        when
        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(command.getWaiterID().value())
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();
        useCase.addRepository(repository);
//        assert
        var event = (TableAdded) events.get(0);
        assertEquals(4, event.getSize().value());
        assertEquals(LocationEnum.OUTSIDE, event.getLocation().value());
        verify(repository).getEventsBy(AR_ID);
    }
}