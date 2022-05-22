package com.zen.dddpracticemodel.cashier.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Status implements ValueObject<StatusEnum> {
    private final StatusEnum value;

    public Status(StatusEnum value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public StatusEnum value() {
        return this.value;
    }
}
