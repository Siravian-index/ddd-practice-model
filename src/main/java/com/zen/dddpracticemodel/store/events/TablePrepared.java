package com.zen.dddpracticemodel.store.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.zen.dddpracticemodel.store.values.TableID;

public class TablePrepared extends DomainEvent {
    private  final TableID tableID;
    public TablePrepared(TableID tableID) {
        super("com.zen.dddpracticemodel.tableprepared");
        this.tableID = tableID;
    }

    public TableID getTableID() {
        return tableID;
    }
}
