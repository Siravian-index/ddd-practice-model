package com.zen.dddpracticemodel.waiter;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.zen.dddpracticemodel.waiter.entities.Order;
import com.zen.dddpracticemodel.waiter.entities.Table;
import com.zen.dddpracticemodel.waiter.events.OrderAdded;
import com.zen.dddpracticemodel.waiter.events.WaiterCreated;
import com.zen.dddpracticemodel.waiter.values.*;

import java.util.List;
import java.util.Set;

public class Waiter extends AggregateEvent<WaiterID> {

    protected Name name;
    protected Set<Table> tableSet;
    protected Set<Order> orderSet;

    public Waiter(WaiterID entityId, Name name) {
        super(entityId);
        applyEvent(new WaiterCreated(name));
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
        applyEvent(new OrderAdded(orderID, description, price));
    }

//    public void updateOrderDescription(OrderID orderID, Description description) {
//        applyEvent(new OrderDescriptionUpdated(orderID, description));
//    }

}
