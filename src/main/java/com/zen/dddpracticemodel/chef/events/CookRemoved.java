package com.zen.dddpracticemodel.chef.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.zen.dddpracticemodel.chef.values.CookID;

public class CookRemoved extends DomainEvent {
    private final CookID cookID;

    public CookRemoved(CookID cookID) {
        super("com.zen.dddpracticemodel.chef.cookremoved");
        this.cookID = cookID;
    }

    public CookID getCookID() {
        return cookID;
    }
}
