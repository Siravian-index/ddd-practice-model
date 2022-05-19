package com.zen.dddpracticemodel.store.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.zen.dddpracticemodel.store.values.KitchenID;

public class KitchenCleaned extends DomainEvent {
    private final KitchenID kitchenID;
    public KitchenCleaned(KitchenID kitchenID) {
        super("com.zen.dddpracticemodel.kitchencleaned");
        this.kitchenID = kitchenID;
    }

    public KitchenID getKitchenID() {
        return kitchenID;
    }
}
