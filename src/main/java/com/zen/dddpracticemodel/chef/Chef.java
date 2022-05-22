package com.zen.dddpracticemodel.chef;

import co.com.sofka.domain.generic.AggregateEvent;
import com.zen.dddpracticemodel.chef.entities.Cook;
import com.zen.dddpracticemodel.chef.entities.Recipe;
import com.zen.dddpracticemodel.chef.values.ChefID;
import com.zen.dddpracticemodel.waiter.values.Name;

import java.util.Set;

public class Chef extends AggregateEvent<ChefID> {

    protected Set<Cook> cookSet;
    protected Set<Recipe> recipeSet;
    protected Name name;

    public Chef(ChefID entityId, Name name) {
        super(entityId);
        appendChange(new ChefCreated(name)).apply();
    }
    private Chef(ChefID entityId) {
        super(entityId);
    }

}
