package com.zen.dddpracticemodel.store.entities;

import co.com.sofka.domain.generic.Entity;
import com.zen.dddpracticemodel.store.values.TableID;

public class Table extends Entity<TableID> {
    public Table(TableID entityId) {
        super(entityId);
    }
}
