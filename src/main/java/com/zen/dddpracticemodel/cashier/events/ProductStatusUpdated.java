package com.zen.dddpracticemodel.cashier.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.zen.dddpracticemodel.cashier.values.ProductID;
import com.zen.dddpracticemodel.cashier.values.Status;

public class ProductStatusUpdated extends DomainEvent {
    private final ProductID productID;
    private final Status status;

    public ProductStatusUpdated(ProductID productID, Status status) {
        super("com.zen.dddpracticemodel.cashier");
        this.productID = productID;
        this.status = status;
    }

    public ProductID getProductID() {
        return productID;
    }

    public Status getStatus() {
        return status;
    }
}
