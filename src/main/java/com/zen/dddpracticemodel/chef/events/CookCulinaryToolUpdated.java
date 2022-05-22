package com.zen.dddpracticemodel.chef.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.zen.dddpracticemodel.chef.values.CookID;
import com.zen.dddpracticemodel.chef.values.CulinaryTool;

public class CookCulinaryToolUpdated extends DomainEvent {
    private final CookID cookID;
    private final CulinaryTool culinaryTool;

    public CookCulinaryToolUpdated(CookID cookID, CulinaryTool culinaryTool) {
        super("com.zen.dddpracticemodel.chef.cookculinarytoolupdated");
        this.cookID = cookID;
        this.culinaryTool = culinaryTool;


    }

    public CookID getCookID() {
        return cookID;
    }

    public CulinaryTool getCulinaryTool() {
        return culinaryTool;
    }
}
