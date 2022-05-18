package com.zen.dddpracticemodel.store.entities;

import co.com.sofka.domain.generic.Entity;
import com.zen.dddpracticemodel.client.values.Money;
import com.zen.dddpracticemodel.store.values.Name;
import com.zen.dddpracticemodel.store.values.Price;
import com.zen.dddpracticemodel.store.values.ProductID;
import com.zen.dddpracticemodel.store.values.Stock;

import java.util.Objects;

public class Product extends Entity<ProductID> {

    protected Money price;
    protected Stock stock;
    protected Name name;


    protected Product(ProductID entityId, Stock stock, Name name, Money price) {
        super(entityId);
        this.stock = stock;
        this.name = name;
        this.price = price;
    }
    private Product(ProductID entityId) {
        super(entityId);
    }

    public static Product from(ProductID entityId, Stock stock, Name name, Money price) {
        Product product = new Product(entityId);
        product.stock = stock;
        product.name = name;
        product.price = price;
        return product;
    }

//    void sellProduct() {}
//    void displayProduct() {}
//    void reStockProduct(){}
//    void disposeProduct() {}


    public Money getPrice() {
        return price;
    }

    public void setPrice(Money price) {
        this.price = price;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Product product = (Product) o;
        return Objects.equals(price, product.price) && Objects.equals(stock, product.stock) && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), price, stock, name);
    }
}
