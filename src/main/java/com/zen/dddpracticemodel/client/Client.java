package com.zen.dddpracticemodel.client;

import co.com.sofka.domain.generic.Entity;
import com.zen.dddpracticemodel.client.values.ClientID;

public class Client extends Entity<ClientID> {
    public Client(ClientID entityId) {
        super(entityId);
    }
}
