package com.zen.dddpracticemodel.order.values;

import co.com.sofka.domain.generic.ValueObject;

import java.time.LocalDateTime;
import java.util.Objects;

public class CreationDate implements ValueObject<String> {
    private final LocalDateTime createdAt;

    CreationDate() {
        this.createdAt = LocalDateTime.now();
    }

    @Override
    public String value() {
        return this.createdAt.toString();
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
