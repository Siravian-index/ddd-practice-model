package com.zen.dddpracticemodel.store.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Equipment implements ValueObject<Name> {

    private final Name name;

    Equipment(Name name) {
        this.name = name;
    }

    @Override
    public Name value() {
        return this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Equipment equipment = (Equipment) o;
        return Objects.equals(name, equipment.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
