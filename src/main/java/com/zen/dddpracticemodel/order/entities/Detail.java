package com.zen.dddpracticemodel.order.entities;

import co.com.sofka.domain.generic.Entity;
import com.zen.dddpracticemodel.client.values.Money;
import com.zen.dddpracticemodel.order.values.CreationDate;
import com.zen.dddpracticemodel.order.values.DetailID;
import com.zen.dddpracticemodel.store.entities.Product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Detail extends Entity<DetailID> {
    protected Money totalCost;
    protected List<Product> productList;
    protected CreationDate createdAt;
    public Detail(DetailID entityId, CreationDate createdAt) {
        super(entityId);
        this.totalCost = new Money(new BigDecimal(0));
        this.createdAt = createdAt;
        this.productList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        this.productList.add(product);
        this.totalCost = updatePrice(this.productList);
    }

    private Money updatePrice(List<Product> productList) {
        BigDecimal total = new BigDecimal(0);
        for (Product product : productList) {
            total = total.add(product.getPrice().value());
        }
        return new Money(total);
    }
}
