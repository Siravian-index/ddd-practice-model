package com.zen.dddpracticemodel.store.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Decoration implements ValueObject<Decoration> {
    protected Name name;
    protected Description description;

    Decoration(Name name, Description description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public Decoration value() {
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Decoration that = (Decoration) o;
        return Objects.equals(name, that.name) && Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description);
    }
}
