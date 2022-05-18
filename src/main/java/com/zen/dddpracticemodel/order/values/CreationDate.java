package com.zen.dddpracticemodel.order.values;

import co.com.sofka.domain.generic.ValueObject;

import java.time.LocalDateTime;
import java.util.Objects;

public class CreationDate implements ValueObject<CreationDate> {
    protected LocalDateTime createdAt;

    CreationDate() {
        this.createdAt = LocalDateTime.now();
    }

    @Override
    public CreationDate value() {
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreationDate that = (CreationDate) o;
        return Objects.equals(createdAt, that.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createdAt);
    }
}
