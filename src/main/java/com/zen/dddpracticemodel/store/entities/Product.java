package com.zen.dddpracticemodel.store.entities;

import co.com.sofka.domain.generic.Entity;
import com.zen.dddpracticemodel.store.values.ProductID;

public class Product extends Entity<ProductID> {
    public Product(ProductID entityId) {
        super(entityId);
    }
}
