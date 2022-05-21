package com.zen.dddpracticemodel.waiter.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.zen.dddpracticemodel.waiter.values.Location;
import com.zen.dddpracticemodel.waiter.values.Size;
import com.zen.dddpracticemodel.waiter.values.TableID;

public class TableAdded extends DomainEvent {
    private final TableID tableID;
    private final Size size;
    private final Location location;

    public TableAdded(TableID tableID, Size size, Location location) {
        super("com.zen.dddpracticemodel.waiter.tableadded");
        this.tableID = tableID;
        this.size = size;
        this.location = location;
    }

    public TableID getTableID() {
        return tableID;
    }

    public Size getSize() {
        return size;
    }

    public Location getLocation() {
        return location;
    }
}
