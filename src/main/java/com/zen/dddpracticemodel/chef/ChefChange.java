package com.zen.dddpracticemodel.chef;

import co.com.sofka.domain.generic.EventChange;
import com.zen.dddpracticemodel.chef.entities.Cook;
import com.zen.dddpracticemodel.chef.entities.Recipe;
import com.zen.dddpracticemodel.chef.events.*;
import com.zen.dddpracticemodel.chef.values.IsReady;

import java.util.HashSet;

public class ChefChange extends EventChange {
    public ChefChange(Chef chef) {
        apply((ChefCreated event) -> {
            chef.name = event.getName();
            chef.cookSet = new HashSet<>();
            chef.recipeSet = new HashSet<>();
        });

        apply((CookAdded event ) -> {
            Cook cook = new Cook(event.getCookID(), event.getName(), event.getCulinaryTool());
            chef.cookSet.add(cook);
        });

        apply((CookRemoved event ) -> {
            chef.cookSet.removeIf(cook -> cook.identity().equals(event.getCookID()));
        });
        apply((CookCulinaryToolUpdated event ) -> {
            Cook cook1 = chef.cookSet.stream().filter(cook -> cook.identity().equals(event.getCookID())).findFirst().orElseThrow();
            cook1.changeCulinaryTool(event.getCulinaryTool());
        });
        apply((RecipeAdded event ) -> {
            Recipe recipe = new Recipe(event.getRecipeID(), event.getName(), event.getDescription());
            chef.recipeSet.add(recipe);
        });
        apply((RecipeRemoved event ) -> {
            chef.recipeSet.removeIf(recipe -> recipe.identity().equals(event.getRecipeID()));
        });
        apply((RecipeDescriptionUpdated event ) -> {
            Recipe recipe = chef.recipeSet.stream().filter(recipe1 -> recipe1.identity().equals(event.getRecipeID())).findFirst().orElseThrow();
            recipe.updateDescription(event.getDescription());
        });
        apply((RecipeIsReadyUpdated event ) -> {
            Recipe recipe = chef.recipeSet.stream().filter(recipe1 -> recipe1.identity().equals(event.getRecipeID())).findFirst().orElseThrow();
            recipe.updatedIsReady(new IsReady(!recipe.getIsReady().value()));
        });
    }

}
