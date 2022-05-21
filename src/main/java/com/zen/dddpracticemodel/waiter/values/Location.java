package com.zen.dddpracticemodel.waiter.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Location implements ValueObject<LocationEnum> {
    private final LocationEnum value;

    public Location(LocationEnum value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public LocationEnum value() {
        return this.value;
    }
}
