package com.zen.dddpracticemodel.store.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.zen.dddpracticemodel.store.values.TableID;

public class TableAttended extends DomainEvent {
    private final TableID tableID;
    public TableAttended(TableID tableID) {
        super("com.zen.dddpracticemodel.storecreated");
        this.tableID = tableID;
    }

    public TableID getTableID() {
        return tableID;
    }
}
