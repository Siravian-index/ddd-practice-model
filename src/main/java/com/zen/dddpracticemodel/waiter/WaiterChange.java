package com.zen.dddpracticemodel.waiter;

import co.com.sofka.domain.generic.EventChange;
import com.zen.dddpracticemodel.waiter.entities.Order;
import com.zen.dddpracticemodel.waiter.entities.Table;
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
            Order order = waiter.orderSet.stream().filter(o -> o.identity().equals(event.getOrderID())).findFirst().orElseThrow();
            order.setDescription(event.getDescription());
            waiter.orderSet.removeIf(o -> o.identity().equals(event.getOrderID()));
            waiter.orderSet.add(order);

        });

        apply((OrderPriceUpdated event) -> {
            Order order = waiter.orderSet.stream().filter(o -> o.identity().equals(event.getOrderID())).findFirst().orElseThrow();
            order.setPrice(event.getPrice());
            waiter.orderSet.removeIf(o -> o.identity().equals(event.getOrderID()));
            waiter.orderSet.add(order);
        });

        apply((TableAdded event) ->{
            Table table = new Table(event.getTableID(), event.getSize(), event.getLocation());
            waiter.tableSet.add(table);

        });

        apply((TableRemoved event) -> {
            waiter.tableSet.removeIf(table -> table.identity().equals(event.getTableID()));
        });

        apply((TableSizeUpdated event) ->{
            Table table = waiter.tableSet.stream().filter(o -> o.identity().equals(event.getTableID())).findFirst().orElseThrow();
            table.updateSize(event.getSize());
            waiter.tableSet.removeIf(o -> o.identity().equals(event.getTableID()));
            waiter.tableSet.add(table);

        });

        apply((TableLocationUpdated event) ->{
            Table table = waiter.tableSet.stream().filter(o -> o.identity().equals(event.getTableID())).findFirst().orElseThrow();
            table.updateLocation(event.getLocation());
            waiter.tableSet.removeIf(o -> o.identity().equals(event.getTableID()));
            waiter.tableSet.add(table);
        });
    }

}
