package com.zen.dddpracticemodel.waiter.entities;

import co.com.sofka.domain.generic.Entity;
import com.zen.dddpracticemodel.waiter.values.Location;
import com.zen.dddpracticemodel.waiter.values.Size;
import com.zen.dddpracticemodel.waiter.values.TableID;

public class Table extends Entity<TableID> {
    protected Size size;
    protected Location location;
    public Table(TableID entityId, Size size, Location location) {
        super(entityId);
        this.size = size;
        this.location = location;
    }

    public Size getSize() {
        return size;
    }

    public void updateSize(Size size) {
        this.size = size;
    }

    public Location getLocation() {
        return location;
    }

    public void updateLocation(Location location) {
        this.location = location;
    }
}
