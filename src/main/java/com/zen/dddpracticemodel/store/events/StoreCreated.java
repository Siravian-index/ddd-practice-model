package com.zen.dddpracticemodel.store.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.zen.dddpracticemodel.store.values.Name;

public class StoreCreated extends DomainEvent {
    private final Name name;

    public StoreCreated(Name name) {
        super("com.zen.dddpracticemodel.StoreCreated");
        this.name = name;
    }

    public Name Name() {
        return name;
    }
}
