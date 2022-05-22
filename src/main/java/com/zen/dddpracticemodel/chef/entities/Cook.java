package com.zen.dddpracticemodel.chef.entities;

import co.com.sofka.domain.generic.Entity;
import com.zen.dddpracticemodel.chef.values.CookID;
import com.zen.dddpracticemodel.chef.values.CulinaryTool;
import com.zen.dddpracticemodel.waiter.values.Name;

public class Cook extends Entity<CookID> {
    protected Name name;
    protected CulinaryTool culinaryTool;

    public Cook(CookID entityId, Name name, CulinaryTool culinaryTool) {
        super(entityId);
        this.name = name;
        this.culinaryTool = culinaryTool;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public CulinaryTool getCulinaryTool() {
        return culinaryTool;
    }

    public void changeCulinaryTool(CulinaryTool culinaryTool) {
        this.culinaryTool = culinaryTool;
    }
}
