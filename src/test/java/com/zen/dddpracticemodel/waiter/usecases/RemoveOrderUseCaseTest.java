package com.zen.dddpracticemodel.waiter.usecases;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import com.zen.dddpracticemodel.waiter.commands.RemoveOrder;
import com.zen.dddpracticemodel.waiter.events.OrderAdded;
import com.zen.dddpracticemodel.waiter.events.OrderRemoved;
import com.zen.dddpracticemodel.waiter.events.WaiterCreated;
import com.zen.dddpracticemodel.waiter.values.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class RemoveOrderUseCaseTest {
    static String AR_ID = "fakeWaiterID";
    static String ENTITY_ID = "fakeOrderID";

    @InjectMocks
    private RemoveOrderUseCase useCase;

    @Mock
    private DomainEventRepository repository;

    @Test
    void removeOrderSuccessfully() {
        var waiterID = WaiterID.of(AR_ID);
        var orderID = OrderID.of(ENTITY_ID);
        var command = new RemoveOrder(waiterID, orderID);

        when(repository.getEventsBy(AR_ID)).thenReturn(List.of(
                new WaiterCreated(new Name("waiterName")),
                new OrderAdded(OrderID.of(ENTITY_ID), new Description("Description#1"), new Price(new BigDecimal(100)))
        ));
        useCase.addRepository(repository);


//        when
        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(AR_ID)
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();
//        assert
        var event = (OrderRemoved) events.get(0);
        assertEquals(command.getOrderID().value(), event.getOrderID().value());
        verify(repository).getEventsBy(AR_ID);
    }

}