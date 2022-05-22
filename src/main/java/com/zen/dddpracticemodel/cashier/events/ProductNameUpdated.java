package com.zen.dddpracticemodel.cashier.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.zen.dddpracticemodel.cashier.values.ProductID;
import com.zen.dddpracticemodel.waiter.values.Name;

public class ProductNameUpdated extends DomainEvent {
    private final ProductID productID;
    private final Name name;

    public ProductNameUpdated(ProductID productID, Name name) {
        super("com.zen.dddpracticemodel.cashier.productnameupdated");
        this.productID = productID;
        this.name = name;
    }

    public ProductID getProductID() {
        return productID;
    }

    public Name getName() {
        return name;
    }
}
