package com.zen.dddpracticemodel.store.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Equipment implements ValueObject<Equipment> {

    protected Name name;
    protected Description description;

    Equipment(Name name, Description description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public Equipment value() {
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Equipment equipment = (Equipment) o;
        return Objects.equals(name, equipment.name) && Objects.equals(description, equipment.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description);
    }
}
