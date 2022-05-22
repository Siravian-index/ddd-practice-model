package com.zen.dddpracticemodel.chef.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.zen.dddpracticemodel.chef.values.RecipeID;
import com.zen.dddpracticemodel.waiter.values.Description;

public class RecipeDescriptionUpdated extends DomainEvent {
    private final RecipeID recipeID;
    private final Description description;

    public RecipeDescriptionUpdated(RecipeID recipeID, Description description) {
        super("com.zen.dddpracticemodel.chef.recipedescriptionupdated");
        this.recipeID = recipeID;
        this.description = description;
    }

    public RecipeID getRecipeID() {
        return recipeID;
    }

    public Description getDescription() {
        return description;
    }
}
