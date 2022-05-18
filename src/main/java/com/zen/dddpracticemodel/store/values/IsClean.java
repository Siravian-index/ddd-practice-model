package com.zen.dddpracticemodel.store.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class IsClean implements ValueObject<Boolean> {

    protected Boolean value;

    IsClean(Boolean value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public Boolean value() {
        return null;
    }
}
