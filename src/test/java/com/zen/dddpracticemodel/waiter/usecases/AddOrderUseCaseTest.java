package com.zen.dddpracticemodel.waiter.usecases;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import com.zen.dddpracticemodel.waiter.Waiter;
import com.zen.dddpracticemodel.waiter.commands.AddOrder;
import com.zen.dddpracticemodel.waiter.events.OrderAdded;
import com.zen.dddpracticemodel.waiter.events.WaiterCreated;
import com.zen.dddpracticemodel.waiter.values.Description;
import com.zen.dddpracticemodel.waiter.values.Name;
import com.zen.dddpracticemodel.waiter.values.Price;
import com.zen.dddpracticemodel.waiter.values.WaiterID;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class AddOrderUseCaseTest {
    static String AR_ID = "fakeWaiterID";
    @InjectMocks
    private AddOrderUseCase useCase;

    @Mock
    private DomainEventRepository repository;

    @Test
    void addOrderToWaiterSuccessfully() {
        var waiterID = WaiterID.of(AR_ID);
        var description = new Description("good recipe #1");
        var price = new Price(new BigDecimal(100));
        var command = new AddOrder(waiterID, description, price);

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
        var event = (OrderAdded) events.get(0);
        assertEquals("good recipe #1", event.getDescription().value());
        assertEquals(new BigDecimal(100), event.getPrice().value());
        verify(repository).getEventsBy(AR_ID);
    }

}