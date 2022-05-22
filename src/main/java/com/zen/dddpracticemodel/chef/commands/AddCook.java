package com.zen.dddpracticemodel.chef.commands;

import co.com.sofka.domain.generic.Command;
import com.zen.dddpracticemodel.chef.values.ChefID;
import com.zen.dddpracticemodel.chef.values.CulinaryTool;
import com.zen.dddpracticemodel.waiter.values.Name;

public class AddCook extends Command {
    private final ChefID chefID;
    private final Name name;
    private final CulinaryTool culinaryTool;

    public AddCook(ChefID chefID, Name name, CulinaryTool culinaryTool) {
        this.chefID = chefID;
        this.name = name;
        this.culinaryTool = culinaryTool;
    }

    public ChefID getChefID() {
        return chefID;
    }

    public Name getName() {
        return name;
    }

    public CulinaryTool getCulinaryTool() {
        return culinaryTool;
    }
}
