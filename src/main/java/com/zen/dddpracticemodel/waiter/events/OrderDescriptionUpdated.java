package com.zen.dddpracticemodel.waiter.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.zen.dddpracticemodel.waiter.values.Description;
import com.zen.dddpracticemodel.waiter.values.OrderID;

public class OrderDescriptionUpdated extends DomainEvent {
    private final OrderID orderID;
    private final Description description;

    public OrderDescriptionUpdated(OrderID orderID, Description description) {
        super("com.zen.dddpracticemodel.waiter.orderdescriptionupdated");
        this.orderID = orderID;
        this.description = description;
    }

    public OrderID getOrderID() {
        return orderID;
    }

    public Description getDescription() {
        return description;
    }
}
