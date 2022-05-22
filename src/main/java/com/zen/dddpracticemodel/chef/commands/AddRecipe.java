package com.zen.dddpracticemodel.chef.commands;

import co.com.sofka.domain.generic.Command;
import com.zen.dddpracticemodel.chef.values.ChefID;
import com.zen.dddpracticemodel.waiter.values.Description;
import com.zen.dddpracticemodel.waiter.values.Name;

public class AddRecipe extends Command {
    private final ChefID chefID;
    private final Name name;
    private final Description description;

    public AddRecipe(ChefID chefID, Name name, Description description) {
        this.chefID = chefID;
        this.name = name;
        this.description = description;
    }

    public ChefID getChefID() {
        return chefID;
    }

    public Name getName() {
        return name;
    }

    public Description getDescription() {
        return description;
    }
}
