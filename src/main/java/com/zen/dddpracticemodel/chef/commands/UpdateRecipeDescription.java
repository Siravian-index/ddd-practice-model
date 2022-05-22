package com.zen.dddpracticemodel.chef.commands;

import co.com.sofka.domain.generic.Command;
import com.zen.dddpracticemodel.chef.values.ChefID;
import com.zen.dddpracticemodel.chef.values.RecipeID;
import com.zen.dddpracticemodel.waiter.values.Description;

public class UpdateRecipeDescription extends Command {
    private final RecipeID recipeID;
    private final Description description;
    private final ChefID chefID;

    public UpdateRecipeDescription(RecipeID recipeID, Description description, ChefID chefID) {
        this.recipeID = recipeID;
        this.description = description;
        this.chefID = chefID;
    }

    public RecipeID getRecipeID() {
        return recipeID;
    }

    public Description getDescription() {
        return description;
    }

    public ChefID getChefID() {
        return chefID;
    }
}
