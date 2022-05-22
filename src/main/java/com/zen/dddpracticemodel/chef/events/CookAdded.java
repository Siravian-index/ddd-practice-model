package com.zen.dddpracticemodel.chef.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.zen.dddpracticemodel.chef.values.CookID;
import com.zen.dddpracticemodel.chef.values.CulinaryTool;
import com.zen.dddpracticemodel.waiter.values.Name;

public class CookAdded extends DomainEvent {
    private final CookID cookID;
    private final Name name;
    private final CulinaryTool culinaryTool;

    public CookAdded(CookID cookID, Name name, CulinaryTool culinaryTool) {
        super("com.zen.dddpracticemodel.chef.coodadded");
        this.cookID = cookID;
        this.name = name;
        this.culinaryTool = culinaryTool;
    }

    public CookID getCookID() {
        return cookID;
    }

    public Name getName() {
        return name;
    }

    public CulinaryTool getCulinaryTool() {
        return culinaryTool;
    }
}
