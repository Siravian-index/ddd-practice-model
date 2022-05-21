package com.zen.dddpracticemodel.waiter.commands;

import co.com.sofka.domain.generic.Command;
import com.zen.dddpracticemodel.waiter.values.OrderID;
import com.zen.dddpracticemodel.waiter.values.WaiterID;

public class RemoveOrder extends Command {
    private final WaiterID waiterID;
    private final OrderID orderID;

    public RemoveOrder(WaiterID waiterID, OrderID orderID) {
        this.waiterID = waiterID;
        this.orderID = orderID;
    }

    public WaiterID getWaiterID() {
        return waiterID;
    }

    public OrderID getOrderID() {
        return orderID;
    }
}
