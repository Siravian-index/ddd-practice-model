package com.zen.dddpracticemodel.store;

import co.com.sofka.domain.generic.EventChange;
import com.zen.dddpracticemodel.store.events.StoreCreated;

import java.util.ArrayList;
import java.util.HashSet;

public class StoreChange extends EventChange {
    protected StoreChange(Store store) {
//        Modify the class in this space. This is like a constructor based on events
        apply((StoreCreated event) -> {
            store.businessDays = event.BusinessDays();
            store.productSet = new HashSet<>();
            store.clientSet = new HashSet<>();
            store.orderList = new ArrayList<>();
            store.employeeSet = new HashSet<>();
            store.tableSet = new HashSet<>();
//            how should I handle the kitchen and holiday entities?
//            store.kitchen = new Kitchen();
//            store.holiday = new Holiday();
        });

    }
}
