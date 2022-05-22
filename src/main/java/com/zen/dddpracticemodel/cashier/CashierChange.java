package com.zen.dddpracticemodel.cashier;

import co.com.sofka.domain.generic.EventChange;
import com.zen.dddpracticemodel.cashier.entities.Product;
import com.zen.dddpracticemodel.cashier.events.*;

import java.util.HashSet;

public class CashierChange extends EventChange {
    public CashierChange(Cashier cashier) {
        apply((CashierCreated event) -> {
            cashier.name = event.getName();
            cashier.productSet = new HashSet<>();
        });

        apply((ProductAdded event) -> {
            Product product  = new Product(event.getEntityId(), event.getName(), event.getPrice());
            cashier.productSet.add(product);
        });

        apply((ProductRemoved event) -> {
            cashier.productSet.removeIf(product -> product.identity().equals(event.getEntityId()));
        });

        apply((ProductStatusUpdated event) -> {
            Product product1 = cashier.productSet.stream().filter(product -> product.identity().equals(event.getProductID())).findFirst().orElseThrow();
            product1.updateStatus(event.getStatus());
        });
        apply((ProductNameUpdated event) -> {
            Product product1 = cashier.productSet.stream().filter(product -> product.identity().equals(event.getProductID())).findFirst().orElseThrow();
            product1.updateName(event.getName());
        });
        apply((ProductPriceUpdated event) -> {
            Product product1 = cashier.productSet.stream().filter(product -> product.identity().equals(event.getProductID())).findFirst().orElseThrow();
            product1.updatePrice(event.getPrice());
        });
    }
}
