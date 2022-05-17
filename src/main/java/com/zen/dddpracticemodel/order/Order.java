package com.zen.dddpracticemodel.order;

import co.com.sofka.domain.generic.AggregateEvent;
import com.zen.dddpracticemodel.order.values.OrderID;

public class Order extends AggregateEvent<OrderID> {
    public Order(OrderID entityId) {
        super(entityId);
    }
}
