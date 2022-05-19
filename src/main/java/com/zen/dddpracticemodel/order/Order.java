package com.zen.dddpracticemodel.order;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.zen.dddpracticemodel.order.entities.Detail;
import com.zen.dddpracticemodel.order.events.DetailsPlaced;
import com.zen.dddpracticemodel.order.events.OrderCreated;
import com.zen.dddpracticemodel.order.values.CreationDate;
import com.zen.dddpracticemodel.order.values.DetailID;
import com.zen.dddpracticemodel.order.values.OrderID;
import com.zen.dddpracticemodel.order.values.Status;

import java.util.List;

public class Order extends AggregateEvent<OrderID> {
    protected Detail detail;
    protected Status status;


    protected Order(OrderID entityId, Status status) {
        super(entityId);
        appendChange(new OrderCreated(status)).apply();
        subscribe(new OrderChange(this));
    }

    private Order(OrderID entityId) {
        super(entityId);
        subscribe(new OrderChange(this));
    }

    public static Order from (OrderID orderID, List<DomainEvent> list) {
        Order order = new Order(orderID);
        list.forEach(order::applyEvent);
        return order;
    }

    public void placeDetails(CreationDate createdAt) {
        var detailID = new DetailID();
        appendChange(new DetailsPlaced(detailID, createdAt)).apply();
    }

    public void addDetail(Detail detail) {

    }

    public Detail getDetail() {
        return detail;
    }

    public void setDetail(Detail detail) {
        this.detail = detail;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
