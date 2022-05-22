package com.zen.dddpracticemodel.cashier;

import co.com.sofka.domain.generic.EventChange;
import com.zen.dddpracticemodel.cashier.events.CashierCreated;
import com.zen.dddpracticemodel.cashier.events.ProductAdded;
import com.zen.dddpracticemodel.cashier.events.ProductRemoved;

import java.util.HashSet;

public class CashierChange extends EventChange {
    public CashierChange(Cashier cashier) {
        apply((CashierCreated event) -> {
            cashier.name = event.getName();
            cashier.productSet = new HashSet<>();
        });

        apply((ProductAdded event) -> {

        });

        apply((ProductRemoved event) -> {

        });

        apply(( event) -> {

        });
        apply(( event) -> {

        });
        apply(( event) -> {

        });
        apply(( event) -> {

        });
    }
}
