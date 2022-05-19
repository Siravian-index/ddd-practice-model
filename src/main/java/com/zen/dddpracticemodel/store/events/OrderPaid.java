package com.zen.dddpracticemodel.store.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.zen.dddpracticemodel.client.values.ClientID;

public class OrderPaid extends DomainEvent {

    private final ClientID clientID;

    public OrderPaid(ClientID clientID) {
        super("com.zen.dddpracticemodel.store.orderpaid");
        this.clientID = clientID;
    }

    public ClientID getClientID() {
        return clientID;
    }
}
