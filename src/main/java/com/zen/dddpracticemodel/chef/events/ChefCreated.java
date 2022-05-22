package com.zen.dddpracticemodel.chef.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.zen.dddpracticemodel.waiter.values.Name;

public class ChefCreated extends DomainEvent {
    private final Name name;

    public ChefCreated(Name name) {
        super("com.zen.dddpracticemodel.chef.chefcreated");
        this.name = name;
    }

    public Name getName() {
        return name;
    }
}
