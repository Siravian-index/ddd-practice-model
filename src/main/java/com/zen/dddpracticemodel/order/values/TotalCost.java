package com.zen.dddpracticemodel.order.values;

import co.com.sofka.domain.generic.ValueObject;
import com.zen.dddpracticemodel.client.values.Money;

import java.util.Objects;

public class TotalCost implements ValueObject<Money> {
    private final Money money;

    TotalCost(Money money) {
        this.money = money;
    }


    @Override
    public Money value() {
        return this.money;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TotalCost totalCost = (TotalCost) o;
        return Objects.equals(money, totalCost.money);
    }

    @Override
    public int hashCode() {
        return Objects.hash(money);
    }
}
