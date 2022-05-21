package com.zen.dddpracticemodel.waiter.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.zen.dddpracticemodel.waiter.values.Size;
import com.zen.dddpracticemodel.waiter.values.TableID;

public class TableSizeUpdated extends DomainEvent {
    private final TableID tableID;
    private final Size size;

    public TableSizeUpdated(TableID tableID, Size size) {
        super("com.zen.dddpracticemodel.waiter.tablesizeupdated");
        this.tableID = tableID;
        this.size = size;
    }

    public TableID getTableID() {
        return tableID;
    }

    public Size getSize() {
        return size;
    }
}
