package com.zen.dddpracticemodel.store;

import co.com.sofka.domain.generic.AggregateEvent;
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
    protected Kitchen kitchen;
    protected Set<Employee> employeeSet;
    protected Holiday holiday;
    public Store(StoreID entityId, BusinessDays businessDays, Set<Product> productSet) {
        super(entityId);
        appendChange(new StoreCreated(businessDays, productSet)).apply();

    }
}
