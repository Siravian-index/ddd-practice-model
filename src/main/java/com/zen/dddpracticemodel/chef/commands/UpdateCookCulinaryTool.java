package com.zen.dddpracticemodel.chef.commands;

import co.com.sofka.domain.generic.Command;
import com.zen.dddpracticemodel.chef.values.ChefID;
import com.zen.dddpracticemodel.chef.values.CookID;
import com.zen.dddpracticemodel.chef.values.CulinaryTool;

public class UpdateCookCulinaryTool extends Command {

    private final ChefID chefID;
    private final CookID cookID;
    private final CulinaryTool culinaryTool;

    public UpdateCookCulinaryTool(ChefID chefID, CookID cookID, CulinaryTool culinaryTool) {
        this.chefID = chefID;
        this.cookID = cookID;
        this.culinaryTool = culinaryTool;
    }

    public ChefID getChefID() {
        return chefID;
    }

    public CookID getCookID() {
        return cookID;
    }

    public CulinaryTool getCulinaryTool() {
        return culinaryTool;
    }
}
