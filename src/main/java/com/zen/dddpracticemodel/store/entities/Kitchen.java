package com.zen.dddpracticemodel.store.entities;

import co.com.sofka.domain.generic.Entity;
import com.zen.dddpracticemodel.store.values.KitchenID;

public class Kitchen extends Entity<KitchenID> {
    public Kitchen(KitchenID entityId) {
        super(entityId);
    }
}
