package com.zen.dddpracticemodel.store.entities;

import co.com.sofka.domain.generic.Entity;
import com.zen.dddpracticemodel.store.values.HolidayID;

public class Holiday extends Entity<HolidayID> {
    public Holiday(HolidayID entityId) {
        super(entityId);
    }
}
