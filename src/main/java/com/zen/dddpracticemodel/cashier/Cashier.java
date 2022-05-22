package com.zen.dddpracticemodel.cashier;

import co.com.sofka.domain.generic.AggregateEvent;
import com.zen.dddpracticemodel.cashier.entities.Product;
import com.zen.dddpracticemodel.cashier.events.CashierCreated;
import com.zen.dddpracticemodel.cashier.values.CashierID;
import com.zen.dddpracticemodel.waiter.values.Name;

import java.util.Set;

public class Cashier extends AggregateEvent<CashierID> {
    protected Set<Product> productSet;
    protected Name name;
    public Cashier(CashierID entityId, Name name) {
        super(entityId);
        this.name = name;
        appendChange(new CashierCreated(name)).apply();
    }

    private Cashier(CashierID cashierID) {
        super(cashierID);
        subscribe(new CashierChange(this));
    }
}
