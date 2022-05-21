package com.zen.dddpracticemodel.waiter.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.zen.dddpracticemodel.waiter.values.Description;
import com.zen.dddpracticemodel.waiter.values.OrderID;
import com.zen.dddpracticemodel.waiter.values.Price;

public class OrderAdded extends DomainEvent {
    private final OrderID orderID;
    private final Description description;
    private final Price price;

    public OrderAdded(OrderID orderID, Description description, Price price) {
        super("com.zen.dddpracticemodel.waiter");

        this.orderID = orderID;
        this.description = description;
        this.price = price;
    }

    public OrderID getOrderID() {
        return orderID;
    }

    public Description getDescription() {
        return description;
    }

    public Price getPrice() {
        return price;
    }
}
