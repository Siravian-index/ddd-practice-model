package com.zen.dddpracticemodel.store.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.zen.dddpracticemodel.client.values.ClientID;
import com.zen.dddpracticemodel.store.entities.Product;

import java.util.List;

public class ProductOrdered extends DomainEvent {
    private final ClientID clientID;
    private final List<Product> products;

    public ProductOrdered(ClientID clientID, List<Product> products) {
        super("com.zen.dddpracticemodel.store.productordered");
        this.clientID = clientID;
        this.products = products;
    }

    public ClientID getClientID() {
        return clientID;
    }

    public List<Product> getProducts() {
        return products;
    }
}
