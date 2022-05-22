package com.zen.dddpracticemodel.chef;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.zen.dddpracticemodel.chef.entities.Cook;
import com.zen.dddpracticemodel.chef.entities.Recipe;
import com.zen.dddpracticemodel.chef.events.*;
import com.zen.dddpracticemodel.chef.values.*;
import com.zen.dddpracticemodel.waiter.WaiterChange;
import com.zen.dddpracticemodel.waiter.values.Description;
import com.zen.dddpracticemodel.waiter.values.Name;

import java.util.List;
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
        subscribe(new ChefChange(this));
    }

    public static Chef from(ChefID chefID, List<DomainEvent> domainEvents) {
        Chef chef = new Chef(chefID);
        domainEvents.forEach(chef::applyEvent);
        return chef;
    }

    //    events
//    CookID entityId, Name name, CulinaryTool culinaryTool
    public void addCook(Name name, CulinaryTool culinaryTool) {
        CookID cookID = new CookID();
        appendChange(new CookAdded(cookID, name, culinaryTool)).apply();
    }

    public void removeCook(CookID cookID) {
        appendChange(new CookRemoved(cookID)).apply();
    }

    public void updateCookCulinaryTool(CookID cookID, CulinaryTool culinaryTool) {
        appendChange(new CookCulinaryToolUpdated(cookID, culinaryTool)).apply();
    }

    public void addRecipe(Name name, Description description) {
        RecipeID recipeID = new RecipeID();
        appendChange(new RecipeAdded(recipeID, name, description)).apply();
    }

    public void removeRecipe(RecipeID recipeID) {
        appendChange(new RecipeRemoved(recipeID)).apply();
    }

    public void updateRecipeDescription(RecipeID recipeID, Description description) {
        appendChange(new RecipeDescriptionUpdated(recipeID, description)).apply();
    }

    public void updateRecipeIsReady(RecipeID recipeID) {
        appendChange(new RecipeIsReadyUpdated(recipeID)).apply();
    }

}
