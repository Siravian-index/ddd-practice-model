package com.zen.dddpracticemodel.chef.commands;

import co.com.sofka.domain.generic.Command;
import com.zen.dddpracticemodel.chef.values.ChefID;
import com.zen.dddpracticemodel.waiter.values.Name;

public class CreateChef extends Command {
    private  final ChefID entityId;
    private  final Name name;

    public CreateChef(ChefID entityId, Name name) {
        this.entityId = entityId;
        this.name = name;
    }

    public ChefID getEntityId() {
        return entityId;
    }

    public Name getName() {
        return name;
    }
}
