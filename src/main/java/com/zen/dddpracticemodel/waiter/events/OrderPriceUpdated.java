package com.zen.dddpracticemodel.waiter.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.zen.dddpracticemodel.waiter.values.OrderID;
import com.zen.dddpracticemodel.waiter.values.Price;

public class OrderPriceUpdated extends DomainEvent {
    private final OrderID orderID;
    private final Price price;

    public OrderPriceUpdated(OrderID orderID, Price price) {
        super("com.zen.dddpracticemodel.waiter.orderpriceupdated");
        this.orderID = orderID;
        this.price = price;
    }

    public OrderID getOrderID() {
        return orderID;
    }

    public Price getPrice() {
        return price;
    }
}
