package com.zen.dddpracticemodel.store.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.zen.dddpracticemodel.store.entities.Product;
import com.zen.dddpracticemodel.store.values.BusinessDays;

import java.util.Set;

public class StoreCreated extends DomainEvent {
    private final BusinessDays businessDays;
    private final Set<Product> productSet;

    public StoreCreated(BusinessDays businessDays, Set<Product> productSet) {
        super("com.zen.dddpracticemodel.StoreCreated");
        this.businessDays = businessDays;
        this.productSet = productSet;
    }

    public BusinessDays BusinessDays() {
        return businessDays;
    }

    public Set<Product> ProductSet() {
        return productSet;
    }
}
