package com.zen.dddpracticemodel.order;

import co.com.sofka.domain.generic.AggregateEvent;
import com.zen.dddpracticemodel.order.entities.Detail;
import com.zen.dddpracticemodel.order.events.OrderCreated;
import com.zen.dddpracticemodel.order.events.OrderPlaced;
import com.zen.dddpracticemodel.order.values.CreationDate;
import com.zen.dddpracticemodel.order.values.OrderID;
import com.zen.dddpracticemodel.order.values.Status;

public class Order extends AggregateEvent<OrderID> {
    protected Detail detail;
    protected Status status;

    protected Order(OrderID entityId, Status status) {
        super(entityId);
        appendChange(new OrderCreated(status)).apply();
        subscribe(new OrderChange(this));
    }

    public void placeOrder(CreationDate createdAt) {
        var orderId = new OrderID();
        appendChange(new OrderPlaced(orderId, createdAt)).apply();
    }

    public void addDetail(Detail detail) {

    }
}
