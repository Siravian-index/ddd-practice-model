package com.zen.dddpracticemodel.waiter.commands;

import co.com.sofka.domain.generic.Command;
import com.zen.dddpracticemodel.waiter.values.TableID;
import com.zen.dddpracticemodel.waiter.values.WaiterID;

public class RemoveTable extends Command {
    private final WaiterID waiterID;
    private final TableID tableID;

    public RemoveTable(WaiterID waiterID, TableID tableID) {
        this.waiterID = waiterID;
        this.tableID = tableID;
    }

    public WaiterID getWaiterID() {
        return waiterID;
    }

    public TableID getTableID() {
        return tableID;
    }
}
