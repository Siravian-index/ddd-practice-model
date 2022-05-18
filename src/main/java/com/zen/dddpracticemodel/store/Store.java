package com.zen.dddpracticemodel.store;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.zen.dddpracticemodel.client.Client;
import com.zen.dddpracticemodel.order.Order;
import com.zen.dddpracticemodel.store.entities.*;
import com.zen.dddpracticemodel.store.events.*;
import com.zen.dddpracticemodel.store.values.*;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public class Store extends AggregateEvent<StoreID> {
    protected Name name;
    protected Set<Client> clientSet;
    protected List<Order> orderList;
    protected Set<Table> tableSet;
    protected Set<Product> productSet;
    protected Set<Employee> employeeSet;
    protected Kitchen kitchen;
    protected Holiday holiday;
    protected Store(StoreID entityId, Name name) {
        super(entityId);
        appendChange(new StoreCreated(name)).apply();
        subscribe(new StoreChange(this));
    }

    private Store(StoreID entityId) {
        super(entityId);
        subscribe(new StoreChange(this));
    }


//    is this method signature only for aggregates?
    public static Store from(StoreID aggregateId, List<DomainEvent> list) {
        Store store = new Store(aggregateId);
        list.forEach(store::applyEvent);
        return store;
    }

//    throw events to create kitchen and Holiday.

    public void prepareTable(TableID tableID) {
        appendChange(new TablePrepared(tableID)).apply();
    }

    public void attendTable(TableID tableID) {
        appendChange(new TableAttended(tableID)).apply();
    }

    public void visitTable(TableID tableID) {
        appendChange(new TableVisited(tableID)).apply();
    }

    public void restockSupply(ProductID productID, Stock amount) {
        appendChange(new SupplyRestocked(productID, amount)).apply();
    }

    public void renameProduct(ProductID productID, Name newName) {
        appendChange(new ProductRenamed(productID, newName)).apply();
    }

    public void sellProduct(ProductID productID, Stock amount) {
        appendChange(new ProductSold(productID, amount)).apply();
    }

    public Optional<Table> findTableById(TableID tableID) {
        return this.tableSet.stream().filter(table -> table.identity().equals(tableID)).findFirst();
    }

    public Optional<Product> findProductById(ProductID productID) {
        return this.productSet.stream().filter(table -> table.identity().equals(productID)).findFirst();
    }

}
