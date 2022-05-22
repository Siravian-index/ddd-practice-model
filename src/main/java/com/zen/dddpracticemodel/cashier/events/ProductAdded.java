package com.zen.dddpracticemodel.cashier.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.zen.dddpracticemodel.cashier.values.ProductID;
import com.zen.dddpracticemodel.waiter.values.Name;
import com.zen.dddpracticemodel.waiter.values.Price;

public class ProductAdded extends DomainEvent {
    private final ProductID entityId;
    private final Name name;
    private final Price price;

    public ProductAdded(ProductID entityId, Name name, Price price) {
        super("com.zen.dddpracticemodel.cashier.productadded");

        this.entityId = entityId;
        this.name = name;
        this.price = price;
    }

    public ProductID getEntityId() {
        return entityId;
    }

    public Name getName() {
        return name;
    }

    public Price getPrice() {
        return price;
    }
}
