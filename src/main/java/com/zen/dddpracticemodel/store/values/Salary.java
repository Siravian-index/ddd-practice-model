package com.zen.dddpracticemodel.store.values;

import co.com.sofka.domain.generic.ValueObject;
import com.zen.dddpracticemodel.client.values.Money;

import java.util.Objects;

public class Salary implements ValueObject<Money> {
    private final Money money;

    Salary(Money money) {
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
        Salary salary = (Salary) o;
        return Objects.equals(money, salary.money);
    }

    @Override
    public int hashCode() {
        return Objects.hash(money);
    }
}
