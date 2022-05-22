package com.zen.dddpracticemodel.chef.commands;

import co.com.sofka.domain.generic.Command;
import com.zen.dddpracticemodel.chef.values.ChefID;
import com.zen.dddpracticemodel.chef.values.CookID;

public class RemoveCook extends Command {
    private final ChefID chefID;
    private final CookID cookID;

    public RemoveCook(ChefID chefID, CookID cookID) {
        this.chefID = chefID;
        this.cookID = cookID;
    }

    public ChefID getChefID() {

        return chefID;
    }

    public CookID getCookID() {
        return cookID;
    }
}
