package com.zen.dddpracticemodel.cashier.commands;

import co.com.sofka.domain.generic.Command;
import com.zen.dddpracticemodel.cashier.values.CashierID;
import com.zen.dddpracticemodel.waiter.values.Name;
import com.zen.dddpracticemodel.waiter.values.Price;

public class AddProduct extends Command {
    private final Price price;
    private final Name name;
    private final CashierID cashierID;

    public AddProduct(Price price, Name name, CashierID cashierID) {
        this.price = price;
        this.name = name;
        this.cashierID = cashierID;
    }

    public Price getPrice() {
        return price;
    }

    public Name getName() {
        return name;
    }

    public CashierID getCashierID() {
        return cashierID;
    }
}
