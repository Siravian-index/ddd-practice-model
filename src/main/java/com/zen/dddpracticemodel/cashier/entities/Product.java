package com.zen.dddpracticemodel.cashier.entities;

import co.com.sofka.domain.generic.Entity;
import com.zen.dddpracticemodel.cashier.values.ProductID;
import com.zen.dddpracticemodel.cashier.values.Status;
import com.zen.dddpracticemodel.cashier.values.StatusEnum;
import com.zen.dddpracticemodel.waiter.values.Name;
import com.zen.dddpracticemodel.waiter.values.Price;

public class Product extends Entity<ProductID> {
    protected Status status;
    protected Name name;
    protected Price price;

    public Product(ProductID entityId, Name name, Price price) {
        super(entityId);
        this.name = name;
        this.price = price;
        this.status = new Status(StatusEnum.STANDARD);
    }

    public Status getStatus() {
        return status;
    }

    public void updateStatus(Status status) {
        this.status = status;
    }

    public Name getName() {
        return name;
    }

    public void updateName(Name name) {
        this.name = name;
    }

    public Price getPrice() {
        return price;
    }

    public void updatePrice(Price price) {
        this.price = price;
    }
}
