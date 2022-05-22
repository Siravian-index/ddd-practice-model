package com.zen.dddpracticemodel.chef.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class CulinaryTool implements ValueObject<CulinaryToolEnum> {
    private final CulinaryToolEnum value;

    public CulinaryTool(CulinaryToolEnum value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public CulinaryToolEnum value() {
        return this.value;
    }
}
