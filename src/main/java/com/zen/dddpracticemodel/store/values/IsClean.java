package com.zen.dddpracticemodel.store.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class IsClean implements ValueObject<Boolean> {

    private final Boolean value;

    public IsClean(Boolean value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public Boolean value() {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IsClean isClean = (IsClean) o;
        return Objects.equals(value, isClean.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
