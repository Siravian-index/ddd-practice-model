package com.zen.dddpracticemodel.store;

import co.com.sofka.domain.generic.EventChange;
import com.zen.dddpracticemodel.store.events.StoreCreated;

public class StoreChange extends EventChange {
    protected StoreChange(Store store) {
//        Modify the class in this space. This is like a constructor based on events
        apply((StoreCreated event) -> {
            store.businessDays = event.BusinessDays();
            store.productSet = event.ProductSet();
        });

    }
}
