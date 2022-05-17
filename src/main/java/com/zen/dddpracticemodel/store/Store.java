package com.zen.dddpracticemodel.store;

import co.com.sofka.domain.generic.AggregateEvent;
import com.zen.dddpracticemodel.client.Client;
import com.zen.dddpracticemodel.order.Order;
import com.zen.dddpracticemodel.store.entities.*;
import com.zen.dddpracticemodel.store.values.BusinessHours;
import com.zen.dddpracticemodel.store.values.StoreID;

import java.util.List;
import java.util.Set;

public class Store extends AggregateEvent<StoreID> {
    protected BusinessHours businessHours;
    protected Set<Client> clientSet;
    protected List<Order> orderList;
    protected Set<Table> tableSet;
    protected Set<Product> productSet;
    protected Kitchen kitchen;
    protected Set<Employee> employeeSet;
    protected Holiday holiday;
    public Store(StoreID entityId) {
        super(entityId);
    }
}
