package com.zen.dddpracticemodel.store.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Stock implements ValueObject<Integer> {
    private final Integer amount;

    Stock(Integer amount) {
        this.amount = Objects.requireNonNull(amount, "Stock amount must have a value");
    }

    @Override
    public Integer value() {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stock stock = (Stock) o;
        return Objects.equals(amount, stock.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }
}
