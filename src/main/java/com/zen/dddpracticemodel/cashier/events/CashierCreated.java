package com.zen.dddpracticemodel.cashier.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.zen.dddpracticemodel.waiter.values.Name;

public class CashierCreated extends DomainEvent {
    private final Name name;

    public CashierCreated(Name name) {
        super("com.zen.dddpracticemodel.cashier.cashiercreated");
        this.name = name;
    }

    public Name getName() {
        return name;
    }
}
