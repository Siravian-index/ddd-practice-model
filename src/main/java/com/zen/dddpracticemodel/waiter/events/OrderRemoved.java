package com.zen.dddpracticemodel.waiter.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.zen.dddpracticemodel.waiter.values.OrderID;

public class OrderRemoved extends DomainEvent {
    private final OrderID orderID;

    public OrderRemoved(OrderID orderID) {
        super("com.zen.dddpracticemodel.waiter.orderremoved");
        this.orderID = orderID;
    }

    public OrderID getOrderID() {
        return orderID;
    }
}

