package com.zen.dddpracticemodel.store.values;

import co.com.sofka.domain.generic.ValueObject;

public class Experience implements ValueObject<Year> {
    private final Year years;

    Experience(Year years) {
        this.years = years;
    }

    @Override
    public Year value() {
        return this.years;
    }
}
