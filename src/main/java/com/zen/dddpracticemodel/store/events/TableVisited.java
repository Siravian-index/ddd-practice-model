package com.zen.dddpracticemodel.store.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.zen.dddpracticemodel.store.values.TableID;

public class TableVisited extends DomainEvent {

    private final TableID tableID;

    public TableVisited(TableID tableID) {
        super("com.zen.dddpracticemodel.tablevisited");
        this.tableID = tableID;
    }

    public TableID getTableID() {
        return tableID;
    }
}
