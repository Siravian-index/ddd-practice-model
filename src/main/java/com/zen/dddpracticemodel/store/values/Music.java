package com.zen.dddpracticemodel.store.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Music implements ValueObject<Name> {

    private final Name name;

    Music(Name name) {
        this.name = name;
    }

    @Override
    public Name value() {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Music music = (Music) o;
        return Objects.equals(name, music.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
