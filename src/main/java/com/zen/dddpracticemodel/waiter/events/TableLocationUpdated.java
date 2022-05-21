package com.zen.dddpracticemodel.waiter.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.zen.dddpracticemodel.waiter.values.Location;
import com.zen.dddpracticemodel.waiter.values.TableID;

public class TableLocationUpdated extends DomainEvent {
    public TableLocationUpdated(TableID tableID, Location location) {
        super("com.zen.dddpracticemodel.waiter.tablelocationupdated");
    }
}
