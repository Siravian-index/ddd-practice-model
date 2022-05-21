package com.zen.dddpracticemodel.waiter.commands;

import co.com.sofka.domain.generic.Command;
import com.zen.dddpracticemodel.waiter.values.Description;
import com.zen.dddpracticemodel.waiter.values.OrderID;
import com.zen.dddpracticemodel.waiter.values.WaiterID;

public class UpdateOrderDescription extends Command {

    private final WaiterID waiterID;
    private final OrderID orderID;
    private final Description description;

    public UpdateOrderDescription(WaiterID waiterID, OrderID orderID, Description description) {
        this.waiterID = waiterID;
        this.orderID = orderID;
        this.description = description;
    }

    public WaiterID getWaiterID() {
        return waiterID;
    }

    public OrderID getOrderID() {
        return orderID;
    }

    public Description getDescription() {
        return description;
    }
}
