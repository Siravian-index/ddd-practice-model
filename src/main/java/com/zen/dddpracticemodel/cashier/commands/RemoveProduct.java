package com.zen.dddpracticemodel.cashier.commands;

import co.com.sofka.domain.generic.Command;
import com.zen.dddpracticemodel.cashier.values.CashierID;
import com.zen.dddpracticemodel.cashier.values.ProductID;

public class RemoveProduct extends Command {
    private final CashierID cashierID;
    private final ProductID productID;

    public RemoveProduct(CashierID cashierID, ProductID productID) {
        this.cashierID = cashierID;
        this.productID = productID;
    }

    public CashierID getCashierID() {
        return cashierID;
    }

    public ProductID getProductID() {
        return productID;
    }
}
