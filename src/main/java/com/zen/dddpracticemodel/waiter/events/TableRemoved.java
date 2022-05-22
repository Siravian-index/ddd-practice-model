package com.zen.dddpracticemodel.waiter.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.zen.dddpracticemodel.waiter.values.TableID;

public class TableRemoved extends DomainEvent {
    private final TableID tableID;

    public TableRemoved(TableID tableID) {
        super("com.zen.dddpracticemodel.waiter.tableremoved");
        this.tableID = tableID;
    }

    public TableID getTableID() {
        return tableID;
    }
}
