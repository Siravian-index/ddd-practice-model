package com.zen.dddpracticemodel.client.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.zen.dddpracticemodel.client.values.Money;
import com.zen.dddpracticemodel.store.values.Name;

public class ClientCreated extends DomainEvent {
    private final Name name;
    private final Money money;

    public ClientCreated(Name name, Money money) {
        super("com.zen.dddpracticemodel.clientcreated");
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
