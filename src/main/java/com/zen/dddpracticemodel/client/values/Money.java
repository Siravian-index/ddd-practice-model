package com.zen.dddpracticemodel.client.values;

import co.com.sofka.domain.generic.ValueObject;

import java.math.BigDecimal;
import java.util.Objects;

public class Money implements ValueObject<BigDecimal> {

    private final BigDecimal value;

    public Money(BigDecimal value) {
        this.value = Objects.requireNonNull(value, "Money must have a value");
    }


    @Override
    public BigDecimal value() {
        return this.value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return Objects.equals(value, money.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
