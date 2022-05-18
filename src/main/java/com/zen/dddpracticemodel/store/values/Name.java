package com.zen.dddpracticemodel.store.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Name implements ValueObject<String> {

    protected String value;

    Name(String value) {
        this.value = Objects.requireNonNull(value, "Name must have a value");
    }

    @Override
    public String value() {
        return value;
    }
}
