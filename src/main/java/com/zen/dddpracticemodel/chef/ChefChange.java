package com.zen.dddpracticemodel.chef;

import co.com.sofka.domain.generic.EventChange;
import com.zen.dddpracticemodel.chef.events.ChefCreated;

import java.util.HashSet;

public class ChefChange extends EventChange {
    public ChefChange(Chef chef) {
        apply((ChefCreated event) -> {
            chef.name = event.getName();
            chef.cookSet = new HashSet<>();
            chef.recipeSet = new HashSet<>();
        });
    }
}
