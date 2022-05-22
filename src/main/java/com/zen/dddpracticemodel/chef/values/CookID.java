package com.zen.dddpracticemodel.chef.values;

import co.com.sofka.domain.generic.Identity;

public class CookID extends Identity {
    public CookID() {
    }

    private CookID(String id) {
        super(id);
    }

    public static CookID of(String id) {
        return new CookID(id);
    }
}
