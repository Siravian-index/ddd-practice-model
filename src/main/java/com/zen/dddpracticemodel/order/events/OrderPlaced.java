package com.zen.dddpracticemodel.order.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.zen.dddpracticemodel.order.values.CreationDate;
import com.zen.dddpracticemodel.order.values.OrderID;

public class OrderPlaced extends DomainEvent {

    private final CreationDate creationDate;
    private final OrderID orderID;

    public OrderPlaced(OrderID orderID, CreationDate createdAt) {
        super("com.zen.dddpracticemodel.OrderPlaced");
        this.orderID = orderID;
        this.creationDate = createdAt;

    }

    public CreationDate CreationDate() {
        return creationDate;
    }

    public OrderID OrderID() {
        return orderID;
    }
}
