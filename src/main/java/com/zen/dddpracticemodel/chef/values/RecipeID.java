package com.zen.dddpracticemodel.chef.values;

import co.com.sofka.domain.generic.Identity;

public class RecipeID extends Identity {
    public RecipeID() {
    }

    private RecipeID(String id) {
        super(id);
    }

    public static RecipeID of(String id) {
        return new RecipeID(id);
    }
}
