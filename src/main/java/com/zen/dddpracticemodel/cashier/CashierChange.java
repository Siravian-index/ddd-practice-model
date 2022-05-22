package com.zen.dddpracticemodel.cashier;

import co.com.sofka.domain.generic.EventChange;
import com.zen.dddpracticemodel.cashier.events.CashierCreated;

import java.util.HashSet;

public class CashierChange extends EventChange {
    public CashierChange(Cashier cashier) {
        apply((CashierCreated event) -> {
            cashier.name = event.getName();
            cashier.productSet = new HashSet<>();
        });
    }
}
