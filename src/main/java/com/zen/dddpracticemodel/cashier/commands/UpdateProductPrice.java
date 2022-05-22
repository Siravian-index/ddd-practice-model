package com.zen.dddpracticemodel.cashier.commands;

import co.com.sofka.domain.generic.Command;
import com.zen.dddpracticemodel.cashier.values.CashierID;
import com.zen.dddpracticemodel.cashier.values.ProductID;
import com.zen.dddpracticemodel.waiter.values.Price;

public class UpdateProductPrice extends Command {
    private final CashierID cashierID;
    private final ProductID productID;
    private final Price price;

    public UpdateProductPrice(CashierID cashierID, ProductID productID, Price price) {
        this.cashierID = cashierID;
        this.productID = productID;
        this.price = price;
    }

    public CashierID getCashierID() {
        return cashierID;
    }

    public ProductID getProductID() {
        return productID;
    }

    public Price getPrice() {
        return price;
    }
}
