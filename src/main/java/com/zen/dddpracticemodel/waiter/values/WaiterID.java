package com.zen.dddpracticemodel.waiter.values;

import co.com.sofka.domain.generic.Identity;

public class WaiterID extends Identity {
    public WaiterID() {
    }

    private WaiterID(String id) {
        super(id);
    }

    public static WaiterID of(String id) {
        return new WaiterID(id);
    }

}
