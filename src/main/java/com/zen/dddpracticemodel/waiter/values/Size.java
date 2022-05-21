package com.zen.dddpracticemodel.waiter.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Size implements ValueObject<Integer> {
    private final Integer value;

    public Size(Integer value) {
        this.value = Objects.requireNonNull(value);
    }


    @Override
    public Integer value() {
        return this.value;
    }
}
