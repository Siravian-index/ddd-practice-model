package com.zen.dddpracticemodel.cashier.commands;

import co.com.sofka.domain.generic.Command;
import com.zen.dddpracticemodel.cashier.values.CashierID;
import com.zen.dddpracticemodel.cashier.values.ProductID;
import com.zen.dddpracticemodel.waiter.values.Name;

public class UpdateProductName extends Command {
    private final CashierID cashierID;
    private final ProductID productID;
    private final Name name;

    public UpdateProductName(CashierID cashierID, ProductID productID, Name name) {
        this.cashierID = cashierID;
        this.productID = productID;
        this.name = name;
    }

    public CashierID getCashierID() {
        return cashierID;
    }

    public ProductID getProductID() {
        return productID;
    }

    public Name getName() {
        return name;
    }
}
