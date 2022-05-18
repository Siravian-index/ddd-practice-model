package com.zen.dddpracticemodel.store.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.zen.dddpracticemodel.store.values.ProductID;
import com.zen.dddpracticemodel.store.values.Stock;

public class ProductSold extends DomainEvent {
    private final ProductID productID;
    private final Stock amount;
    public ProductSold(ProductID productID, Stock amount) {
        super("com.zen.dddpracticemodel.productsold");
        this.productID = productID;
        this.amount = amount;

    }

    public ProductID getProductID() {
        return productID;
    }

    public Stock getAmount() {
        return amount;
    }
}
