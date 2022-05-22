package com.zen.dddpracticemodel.chef.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class IsReady implements ValueObject<Boolean> {
    private final Boolean value;

    public IsReady(Boolean value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public Boolean value() {
        return this.value;
    }
}
