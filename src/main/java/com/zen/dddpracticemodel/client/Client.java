package com.zen.dddpracticemodel.client;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.zen.dddpracticemodel.client.events.ClientCreated;
import com.zen.dddpracticemodel.client.values.ClientID;
import com.zen.dddpracticemodel.client.values.Money;
import com.zen.dddpracticemodel.order.values.OrderID;
import com.zen.dddpracticemodel.store.values.Name;

import java.util.List;
import java.util.Objects;

public class Client extends AggregateEvent<ClientID> {
    protected Name name;
    protected Money money;

    protected OrderID orderID;
    public Client(ClientID entityId, Name name, Money money) {
        super(entityId);
        appendChange(new ClientCreated(name, money)).apply();
        subscribe(new ClientChange(this));

    }

    private Client(ClientID entityId) {
        super(entityId);
    }

    public static Client from(ClientID clientID, List<DomainEvent> list) {
        Client client = new Client(clientID);
        list.forEach(client::applyEvent);
        return client;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Money getMoney() {
        return money;
    }

    public void setMoney(Money money) {
        this.money = money;
    }

    public OrderID getOrderID() {
        return orderID;
    }

    public void setOrderID(OrderID orderID) {
        this.orderID = orderID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Client client = (Client) o;
        return Objects.equals(name, client.name) && Objects.equals(money, client.money);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, money);
    }
}
