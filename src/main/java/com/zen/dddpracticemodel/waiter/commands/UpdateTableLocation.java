package com.zen.dddpracticemodel.waiter.commands;

import co.com.sofka.domain.generic.Command;
import com.zen.dddpracticemodel.waiter.values.Location;
import com.zen.dddpracticemodel.waiter.values.TableID;
import com.zen.dddpracticemodel.waiter.values.WaiterID;

public class UpdateTableLocation extends Command {
    private final WaiterID waiterID;
    private final TableID tableID;
    private final Location location;

    public UpdateTableLocation(WaiterID waiterID, TableID tableID, Location location) {
        this.waiterID = waiterID;
        this.tableID = tableID;
        this.location = location;
    }

    public WaiterID getWaiterID() {
        return waiterID;
    }

    public TableID getTableID() {
        return tableID;
    }

    public Location getLocation() {
        return location;
    }
}
