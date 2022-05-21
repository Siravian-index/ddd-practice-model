package com.zen.dddpracticemodel.waiter.commands;

import co.com.sofka.domain.generic.Command;
import com.zen.dddpracticemodel.waiter.values.OrderID;
import com.zen.dddpracticemodel.waiter.values.Price;
import com.zen.dddpracticemodel.waiter.values.WaiterID;

public class UpdateOrderPrice extends Command {
    private final OrderID orderID;
    private final Price price;
    private final WaiterID waiterID;

    public UpdateOrderPrice(OrderID orderID, Price price, WaiterID waiterID) {
        this.orderID = orderID;
        this.price = price;
        this.waiterID = waiterID;
    }

    public OrderID getOrderID() {
        return orderID;
    }

    public Price getPrice() {
        return price;
    }

    public WaiterID getWaiterID() {
        return waiterID;
    }
}
