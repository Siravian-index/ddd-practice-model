package com.zen.dddpracticemodel.chef.commands;

import co.com.sofka.domain.generic.Command;
import com.zen.dddpracticemodel.chef.values.ChefID;
import com.zen.dddpracticemodel.chef.values.RecipeID;

public class RemoveRecipe extends Command {
    private final RecipeID recipeID;
    private final ChefID chefID;

    public RemoveRecipe(RecipeID recipeID, ChefID chefID) {
        this.recipeID = recipeID;
        this.chefID = chefID;
    }

    public RecipeID getRecipeID() {
        return recipeID;
    }

    public ChefID getChefID() {
        return chefID;
    }
}
