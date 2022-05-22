package com.zen.dddpracticemodel.chef.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.zen.dddpracticemodel.chef.values.RecipeID;
import com.zen.dddpracticemodel.waiter.values.Description;
import com.zen.dddpracticemodel.waiter.values.Name;

public class RecipeAdded extends DomainEvent {
    private final RecipeID recipeID;
    private final Name name;
    private final Description description;

    public RecipeAdded(RecipeID recipeID, Name name, Description description) {
        super("com.zen.dddpracticemodel.chef.recipeadded");
        this.recipeID = recipeID;
        this.name = name;
        this.description = description;
    }

    public RecipeID getRecipeID() {
        return recipeID;
    }

    public Name getName() {
        return name;
    }

    public Description getDescription() {
        return description;
    }
}
