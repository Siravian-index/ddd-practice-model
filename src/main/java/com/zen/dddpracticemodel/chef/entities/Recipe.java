package com.zen.dddpracticemodel.chef.entities;

import co.com.sofka.domain.generic.Entity;
import com.zen.dddpracticemodel.chef.values.IsReady;
import com.zen.dddpracticemodel.chef.values.RecipeID;
import com.zen.dddpracticemodel.waiter.values.Description;
import com.zen.dddpracticemodel.waiter.values.Name;

public class Recipe extends Entity<RecipeID> {
    protected IsReady isReady;
    protected  Name name;
    protected Description description;

    public Recipe(RecipeID entityId, Name name, Description description) {
        super(entityId);
        this.name = name;
        this.description = description;
        this.isReady = new IsReady(false);
    }

    public IsReady getIsReady() {
        return isReady;
    }

    public void updatedIsReady(IsReady isReady) {
        this.isReady = isReady;
    }

    public Name getName() {
        return name;
    }

    public Description getDescription() {
        return description;
    }

    public void updateDescription(Description description) {
        this.description = description;
    }
}
