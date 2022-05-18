package com.zen.dddpracticemodel.store.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class IsAvailable implements ValueObject<Boolean> {

    private final Boolean value;

    public IsAvailable(Boolean bool) {
        this.value = Objects.requireNonNull(bool, "Boolean must have a value");
    }


    @Override
    public Boolean value() {
        return this.value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IsAvailable that = (IsAvailable) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
