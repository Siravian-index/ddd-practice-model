package com.zen.dddpracticemodel.cashier.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.zen.dddpracticemodel.cashier.values.ProductID;

public class ProductRemoved extends DomainEvent {
    private final ProductID entityId;

    public ProductRemoved(ProductID entityId) {
        super("com.zen.dddpracticemodel.cashier.productremoved");
        this.entityId = entityId;
    }

    public ProductID getEntityId() {
        return entityId;
    }
}
