package com.zen.dddpracticemodel.waiter.entities;

import co.com.sofka.domain.generic.Entity;
import com.zen.dddpracticemodel.waiter.values.Description;
import com.zen.dddpracticemodel.waiter.values.OrderID;
import com.zen.dddpracticemodel.waiter.values.Price;

public class Order extends Entity<OrderID> {
    protected Description description;
    protected Price price;
    public Order(OrderID entityId, Description description, Price price) {
        super(entityId);
        this.description = description;
        this.price  = price;
    }

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }
}
