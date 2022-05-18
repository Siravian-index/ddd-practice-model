package com.zen.dddpracticemodel.store.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Size implements ValueObject<Integer> {
    private final Integer value;

    Size(Integer value) {
        this.value = Objects.requireNonNull(value, "Size must have a value");
    }


    @Override
    public Integer value() {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Size size = (Size) o;
        return Objects.equals(value, size.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
