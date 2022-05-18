package com.zen.dddpracticemodel.store.values;

import co.com.sofka.domain.generic.ValueObject;

public class Ingredient implements ValueObject<Name> {
    protected Name name;

    Ingredient(Name name) {
        this.name = name;
    }

    @Override
    public Name value() {
        return this.name;
    }
}
