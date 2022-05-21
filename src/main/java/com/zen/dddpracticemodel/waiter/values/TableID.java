package com.zen.dddpracticemodel.waiter.values;

import co.com.sofka.domain.generic.Identity;

public class TableID extends Identity {
    public TableID() {
    }

    private TableID(String id) {
        super(id);
    }

    public static TableID of(String id) {
        return new TableID(id);
    }
}
