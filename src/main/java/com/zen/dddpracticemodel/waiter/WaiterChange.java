package com.zen.dddpracticemodel.waiter;

import co.com.sofka.domain.generic.EventChange;
import com.zen.dddpracticemodel.waiter.events.WaiterCreated;

import java.util.HashSet;

public class WaiterChange extends EventChange {

    WaiterChange(Waiter waiter) {
        apply((WaiterCreated  event) -> {
            waiter.name = event.getName();
            waiter.tableSet = new HashSet<>();
            waiter.orderSet = new HashSet<>();
        });
    }
}
