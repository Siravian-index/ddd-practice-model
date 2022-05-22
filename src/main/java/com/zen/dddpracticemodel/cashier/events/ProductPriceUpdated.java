package com.zen.dddpracticemodel.cashier.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.zen.dddpracticemodel.cashier.values.ProductID;
import com.zen.dddpracticemodel.waiter.values.Price;

public class ProductPriceUpdated extends DomainEvent {
    private final ProductID productID;
    private final Price price;

    public ProductPriceUpdated(ProductID productID, Price price) {
        super("com.zen.dddpracticemodel.cashier.productpriceupdated");
        this.productID = productID;
        this.price = price;
    }

    public ProductID getProductID() {
        return productID;
    }

    public Price getPrice() {
        return price;
    }
}
