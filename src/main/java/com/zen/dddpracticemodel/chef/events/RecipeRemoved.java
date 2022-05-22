package com.zen.dddpracticemodel.chef.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.zen.dddpracticemodel.chef.values.RecipeID;

public class RecipeRemoved extends DomainEvent {
    private final RecipeID recipeID;

    public RecipeRemoved(RecipeID recipeID) {
        super("com.zen.dddpracticemodel.chef.reciperemoved");
        this.recipeID = recipeID;
    }

    public RecipeID getRecipeID() {
        return recipeID;
    }
}
