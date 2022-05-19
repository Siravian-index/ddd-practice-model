package com.zen.dddpracticemodel.order.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Status implements ValueObject<StatusEnum> {
    private final StatusEnum value;

    public Status(StatusEnum status) {
        this.value = Objects.requireNonNull(status);
    }

    @Override
    public StatusEnum value() {
        return this.value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Status status = (Status) o;
        return value == status.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}

public enum StatusEnum {
    OPEN, PAID, CANCELLED, READY
}
