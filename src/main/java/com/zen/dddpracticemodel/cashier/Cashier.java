package com.zen.dddpracticemodel.cashier;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.zen.dddpracticemodel.cashier.entities.Product;
import com.zen.dddpracticemodel.cashier.events.*;
import com.zen.dddpracticemodel.cashier.values.CashierID;
import com.zen.dddpracticemodel.cashier.values.ProductID;
import com.zen.dddpracticemodel.cashier.values.Status;
import com.zen.dddpracticemodel.waiter.values.Name;
import com.zen.dddpracticemodel.waiter.values.Price;

import java.util.List;
import java.util.Set;

public class Cashier extends AggregateEvent<CashierID> {
    protected Set<Product> productSet;
    protected Name name;

    public Cashier(CashierID entityId, Name name) {
        super(entityId);
        this.name = name;
        appendChange(new CashierCreated(name)).apply();
    }

    private Cashier(CashierID cashierID) {
        super(cashierID);
        subscribe(new CashierChange(this));
    }

    public static Cashier from(CashierID cashierID, List<DomainEvent> domainEvents) {
        Cashier cashier = new Cashier(cashierID);
        domainEvents.forEach(cashier::applyEvent);
        return cashier;
    }

    //    events
    public void addProduct(Name name, Price price) {
        ProductID entityId = new ProductID();
        appendChange(new ProductAdded(entityId, name, price)).apply();
    }

    public void removeProduct(ProductID entityId) {
        appendChange(new ProductRemoved(entityId)).apply();
    }

    public void updateProductStatus(ProductID productID, Status status) {
        appendChange(new ProductStatusUpdated(productID, status)).apply();

    }

    public void updateProductPrice(ProductID productID, Price price) {
        appendChange(new ProductPriceUpdated(productID, price)).apply();
    }

    public void updateProductName(ProductID productID, Name name) {
        appendChange(new ProductNameUpdated(productID, name)).apply();
    }
}
