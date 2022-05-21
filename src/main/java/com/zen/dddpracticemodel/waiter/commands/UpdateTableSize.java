package com.zen.dddpracticemodel.waiter.commands;

import co.com.sofka.domain.generic.Command;
import com.zen.dddpracticemodel.waiter.values.Size;
import com.zen.dddpracticemodel.waiter.values.TableID;
import com.zen.dddpracticemodel.waiter.values.WaiterID;

public class UpdateTableSize extends Command {
    private final WaiterID waiterID;
    private final TableID tableID;
    private final Size size;

    public UpdateTableSize(WaiterID waiterID, TableID tableID, Size size) {
        this.waiterID = waiterID;
        this.tableID = tableID;
        this.size = size;
    }

    public WaiterID getWaiterID() {
        return waiterID;
    }

    public TableID getTableID() {
        return tableID;
    }

    public Size getSize() {
        return size;
    }
}
