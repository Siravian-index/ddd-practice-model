package com.zen.dddpracticemodel.store;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.zen.dddpracticemodel.client.Client;
import com.zen.dddpracticemodel.order.Order;
import com.zen.dddpracticemodel.store.entities.*;
import com.zen.dddpracticemodel.store.events.StoreCreated;
import com.zen.dddpracticemodel.store.values.BusinessDays;
import com.zen.dddpracticemodel.store.values.StoreID;

import java.util.List;
import java.util.Set;

public class Store extends AggregateEvent<StoreID> {
    protected BusinessDays businessDays;
    protected Set<Client> clientSet;
    protected List<Order> orderList;
    protected Set<Table> tableSet;
    protected Set<Product> productSet;
    protected Set<Employee> employeeSet;
    protected Kitchen kitchen;
    protected Holiday holiday;
    protected Store(StoreID entityId, BusinessDays businessDays) {
        super(entityId);
        appendChange(new StoreCreated(businessDays)).apply();
    }

    private Store(StoreID entityId) {
        super(entityId);
        subscribe(new StoreChange(this));
    }

    public static Store from(StoreID aggregateId, List<DomainEvent> list) {
        Store store = new Store(aggregateId);
        list.forEach(store::applyEvent);
        return store;
    }

}
