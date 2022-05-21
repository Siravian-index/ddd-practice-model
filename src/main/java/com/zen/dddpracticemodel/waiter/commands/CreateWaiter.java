package com.zen.dddpracticemodel.waiter.commands;

import co.com.sofka.domain.generic.Command;
import com.zen.dddpracticemodel.waiter.values.Name;
import com.zen.dddpracticemodel.waiter.values.WaiterID;

public class CreateWaiter extends Command {
    private final WaiterID entityId;
    private final Name name;

    public CreateWaiter(WaiterID entityId, Name name) {
        this.entityId = entityId;
        this.name = name;
    }

    public WaiterID getEntityId() {
        return entityId;
    }

    public Name getName() {
        return name;
    }
}
