package com.zen.dddpracticemodel.cashier.values;

import co.com.sofka.domain.generic.Identity;
import com.zen.dddpracticemodel.chef.values.CookID;

public class CashierID extends Identity {
    public CashierID() {
    }

    private CashierID(String id) {
        super(id);
    }

    public static CashierID of(String id) {
        return new CashierID(id);
    }
}
