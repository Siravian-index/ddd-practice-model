package com.zen.dddpracticemodel.store.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Year implements ValueObject<Integer> {
    private final Integer years;

    Year(Integer years) {
        this.years = Objects.requireNonNull(years);
    }


    @Override
    public Integer value() {
        return this.years;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Year year = (Year) o;
        return Objects.equals(years, year.years);
    }

    @Override
    public int hashCode() {
        return Objects.hash(years);
    }
}
