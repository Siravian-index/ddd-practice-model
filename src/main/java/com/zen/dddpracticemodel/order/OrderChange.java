package com.zen.dddpracticemodel.order;

import co.com.sofka.domain.generic.EventChange;
import com.zen.dddpracticemodel.order.events.OrderCreated;

public class OrderChange extends EventChange {
    public OrderChange(Order order) {
        apply((OrderCreated event) -> {
            order.status = event.status();
        });
    }
}
