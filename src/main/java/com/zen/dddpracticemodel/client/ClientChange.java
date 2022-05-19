package com.zen.dddpracticemodel.client;

import co.com.sofka.domain.generic.EventChange;
import com.zen.dddpracticemodel.client.events.ClientCreated;

public class ClientChange  extends EventChange {

    public ClientChange(Client client) {
        apply((ClientCreated event) -> {
            client.money = event.getMoney();
            client.name = event.getName();
        });

    }

}
