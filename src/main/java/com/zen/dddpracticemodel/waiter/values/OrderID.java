package com.zen.dddpracticemodel.waiter.values;

import co.com.sofka.domain.generic.Identity;

public class OrderID extends Identity {
    public OrderID() {
    }

    private OrderID(String id) {
        super(id);
    }

    public static OrderID of(String id) {
        return new OrderID(id);
    }
}
