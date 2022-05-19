package com.zen.dddpracticemodel.order.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.zen.dddpracticemodel.order.values.Status;

public class OrderCreated extends DomainEvent {
    private final Status status;

    public OrderCreated(Status status) {
        super("com.zen.dddpracticemodel.ordercreated");
        this.status = status;

    }

    public Status status() {
        return status;
    }
}
