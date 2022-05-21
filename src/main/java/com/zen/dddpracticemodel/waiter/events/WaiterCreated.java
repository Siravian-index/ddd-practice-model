package com.zen.dddpracticemodel.waiter.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.zen.dddpracticemodel.waiter.values.Name;

public class WaiterCreated extends DomainEvent {
    private final Name name;

    public WaiterCreated(Name name) {
        super("com.zen.dddpracticemodel.waiter.waitercreated");
        this.name = name;
    }

    public Name getName() {
        return name;

    }
}
