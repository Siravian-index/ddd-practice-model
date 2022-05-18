package com.zen.dddpracticemodel.store.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Experience implements ValueObject<Experience> {
    protected Description description;
    protected Year years;

    Experience(Description description, Year years) {
        this.description = description;
        this.years = years;
    }


    @Override
    public Experience value() {
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Experience that = (Experience) o;
        return Objects.equals(description, that.description) && Objects.equals(years, that.years);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, years);
    }
}
