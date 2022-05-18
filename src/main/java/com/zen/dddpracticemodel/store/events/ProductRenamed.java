package com.zen.dddpracticemodel.store.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.zen.dddpracticemodel.store.values.Name;
import com.zen.dddpracticemodel.store.values.ProductID;

public class ProductRenamed extends DomainEvent {

    private final ProductID productID;
    private final Name name;

    public ProductRenamed(ProductID productID, Name name) {
        super("com.zen.dddpracticemodel.productrenamed");
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
