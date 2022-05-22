package com.zen.dddpracticemodel.waiter;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.zen.dddpracticemodel.waiter.entities.Order;
import com.zen.dddpracticemodel.waiter.entities.Table;
import com.zen.dddpracticemodel.waiter.events.*;
import com.zen.dddpracticemodel.waiter.values.*;

import java.util.List;
import java.util.Set;

public class Waiter extends AggregateEvent<WaiterID> {

    protected Name name;
    protected Set<Table> tableSet;
    protected Set<Order> orderSet;

    public Waiter(WaiterID entityId, Name name) {
        super(entityId);
        appendChange(new WaiterCreated(name)).apply();
    }

    private Waiter(WaiterID entityId) {
        super(entityId);
        subscribe(new WaiterChange(this));
    }

    public static Waiter from(WaiterID waiterID, List<DomainEvent> domainEvents) {
        Waiter waiter = new Waiter(waiterID);
        domainEvents.forEach(waiter::applyEvent);
        return waiter;
    }

//    events

    public void addOrder(Description description, Price price) {
        OrderID orderID = new OrderID();
        appendChange(new OrderAdded(orderID, description, price)).apply();
    }

    public void removeOrder(OrderID orderID) {
        appendChange(new OrderRemoved(orderID)).apply();
    }

    public void updateOrderDescription(OrderID orderID, Description description) {
        appendChange(new OrderDescriptionUpdated(orderID, description)).apply();
    }

    public void updateOrderPrice(OrderID orderID, Price price) {
        appendChange(new OrderPriceUpdated(orderID, price)).apply();
    }

    public void addTable(Size size, Location location) {
        TableID tableID = new TableID();
        appendChange(new TableAdded(tableID, size, location)).apply();
    }

    public void removeTable(TableID tableID) {
        appendChange(new TableRemoved(tableID)).apply();
    }

    public void updateTableSize(TableID tableID, Size size) {
        appendChange(new TableSizeUpdated(tableID, size)).apply();
    }

    public void updateTableLocation(TableID tableID, Location location) {
        appendChange(new TableLocationUpdated(tableID, location)).apply();
    }
}
