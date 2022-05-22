package com.zen.dddpracticemodel.cashier.commands;

import co.com.sofka.domain.generic.Command;
import com.zen.dddpracticemodel.cashier.values.CashierID;
import com.zen.dddpracticemodel.cashier.values.ProductID;
import com.zen.dddpracticemodel.cashier.values.Status;

public class UpdateProductStatus extends Command {
    private final CashierID cashierID;
    private final ProductID productID;
    private final Status status;

    public UpdateProductStatus(CashierID cashierID, ProductID productID, Status status) {
        this.cashierID = cashierID;
        this.productID = productID;
        this.status = status;
    }

    public CashierID getCashierID() {
        return cashierID;
    }

    public ProductID getProductID() {
        return productID;
    }

    public Status getStatus() {
        return status;
    }
}
