package com.zen.dddpracticemodel.client;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.Entity;
import com.zen.dddpracticemodel.client.events.ClientCreated;
import com.zen.dddpracticemodel.client.values.ClientID;
import com.zen.dddpracticemodel.client.values.Money;
import com.zen.dddpracticemodel.store.values.Name;

public class Client extends AggregateEvent<ClientID> {
    protected Name name;
    protected Money money;
    public Client(ClientID entityId, Name name, Money money) {
        super(entityId);
        appendChange(new ClientCreated(name, money)).apply();
        subscribe(new ClientChange(this));

    }

//    private Client(ClientID entityId) {
//        super(entityId);
//    }

//    protected constructor
//    private constructor
//    static constructor
}
