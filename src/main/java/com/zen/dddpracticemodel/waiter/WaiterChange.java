package com.zen.dddpracticemodel.waiter;

import co.com.sofka.domain.generic.EventChange;
import com.zen.dddpracticemodel.waiter.entities.Order;
import com.zen.dddpracticemodel.waiter.events.*;

import java.util.HashSet;

public class WaiterChange extends EventChange {

    WaiterChange(Waiter waiter) {
        apply((WaiterCreated  event) -> {
            waiter.name = event.getName();
            waiter.tableSet = new HashSet<>();
            waiter.orderSet = new HashSet<>();
        });

        apply((OrderAdded event) -> {
            Order order = new Order(event.getOrderID(), event.getDescription(), event.getPrice());
            waiter.orderSet.add(order);
        });

        apply((OrderRemoved event) -> {
            waiter.orderSet.removeIf(order -> order.identity().equals(event.getOrderID()));
        });

        apply((OrderDescriptionUpdated event) -> {
//            TODO: logic
        });

        apply((OrderPriceUpdated event) -> {
//            TODO: logic

        });

        apply((TableAdded event) ->{
//            TODO: logic

        });

        apply((TableRemoved event) ->{
//            TODO: logic

        });

        apply((TableSizeUpdated event) ->{
//            TODO: logic

        });

        apply((TableLocationUpdated event) ->{
//            TODO: logic

        });
    }

}
