package com.zen.dddpracticemodel.order;

import co.com.sofka.domain.generic.EventChange;
import com.zen.dddpracticemodel.order.entities.Detail;
import com.zen.dddpracticemodel.order.events.OrderCreated;
import com.zen.dddpracticemodel.order.events.DetailsPlaced;

public class OrderChange extends EventChange {
    public OrderChange(Order order) {
        apply((OrderCreated event) -> {
            order.status = event.status();
        });

        apply((DetailsPlaced event) -> {
            order.detail = new Detail(event.detailID(), event.creationDate());
        });
    }
}
