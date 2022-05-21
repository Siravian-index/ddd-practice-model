package com.zen.dddpracticemodel.waiter.commands;

import co.com.sofka.domain.generic.Command;
import com.zen.dddpracticemodel.waiter.values.Location;
import com.zen.dddpracticemodel.waiter.values.Size;
import com.zen.dddpracticemodel.waiter.values.WaiterID;

public class AddTable extends Command {
    private final WaiterID waiterID;
    private final Size size;
    private final Location location;

    public AddTable(WaiterID waiterID, Size size, Location location) {
        this.waiterID = waiterID;
        this.size = size;
        this.location = location;
    }

    public WaiterID getWaiterID() {
        return waiterID;
    }

    public Size getSize() {
        return size;
    }

    public Location getLocation() {
        return location;
    }
}
