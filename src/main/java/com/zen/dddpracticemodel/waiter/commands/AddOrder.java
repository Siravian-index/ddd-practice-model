package com.zen.dddpracticemodel.waiter.commands;

import co.com.sofka.domain.generic.Command;
import com.zen.dddpracticemodel.waiter.values.Description;
import com.zen.dddpracticemodel.waiter.values.Price;
import com.zen.dddpracticemodel.waiter.values.WaiterID;

public class AddOrder extends Command {
    private final WaiterID waiterID;
    private final Description description;
    private final Price price;

    public AddOrder(WaiterID waiterID, Description description, Price price) {
        this.waiterID = waiterID;
        this.description = description;
        this.price = price;
    }

    public WaiterID getWaiterID() {
        return waiterID;
    }

    public Description getDescription() {
        return description;
    }

    public Price getPrice() {
        return price;
    }
}
