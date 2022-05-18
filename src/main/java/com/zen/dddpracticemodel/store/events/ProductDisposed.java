package com.zen.dddpracticemodel.store.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.zen.dddpracticemodel.store.values.ProductID;

public class ProductDisposed extends DomainEvent {
    private final ProductID productID;

    public ProductDisposed(ProductID productID) {
        super("com.zen.dddpracticemodel.productdisposed");
        this.productID = productID;
    }

    public ProductID getProductID() {
        return productID;
    }
}
