package com.zen.dddpracticemodel.waiter;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.zen.dddpracticemodel.waiter.events.WaiterCreated;
import com.zen.dddpracticemodel.waiter.values.Name;
import com.zen.dddpracticemodel.waiter.values.WaiterID;

import java.util.List;

public class Waiter extends AggregateEvent<WaiterID> {

    protected Name name;

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
}
