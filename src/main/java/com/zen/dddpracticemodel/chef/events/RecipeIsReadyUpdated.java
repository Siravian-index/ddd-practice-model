package com.zen.dddpracticemodel.chef.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.zen.dddpracticemodel.chef.values.RecipeID;

public class RecipeIsReadyUpdated extends DomainEvent {
    private final RecipeID recipeID;

    public RecipeIsReadyUpdated(RecipeID recipeID) {
        super("com.zen.dddpracticemodel.chef.recipeisreadyupdated");
        this.recipeID = recipeID;
    }

    public RecipeID getRecipeID() {
        return recipeID;
    }
}
