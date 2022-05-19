package com.zen.dddpracticemodel.store.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.zen.dddpracticemodel.client.values.Money;
import com.zen.dddpracticemodel.store.values.Name;

public class ClientEntered extends DomainEvent {
    private final Name name;
    private final Money money;

    public ClientEntered(Name name, Money money) {
        super("com.zen.dddpracticemodel.store.cliententered");
        this.name = name;
        this.money = money;
    }

    public Name getName() {
        return name;
    }

    public Money getMoney() {
        return money;
    }
}
