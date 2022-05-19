package com.zen.dddpracticemodel.store.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.zen.dddpracticemodel.order.values.OrderID;

public class OrderPrepared extends DomainEvent {
    private final OrderID orderID;

    public OrderPrepared(OrderID orderID) {
        super("com.zen.dddpracticemodel.orderprepared");
        this.orderID = orderID;
    }

    public OrderID getOrderID() {
        return orderID;
    }
}
