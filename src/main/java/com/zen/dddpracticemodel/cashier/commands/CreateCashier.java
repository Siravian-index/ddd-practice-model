package com.zen.dddpracticemodel.cashier.commands;

import co.com.sofka.domain.generic.Command;
import com.zen.dddpracticemodel.cashier.values.CashierID;
import com.zen.dddpracticemodel.waiter.values.Name;

public class CreateCashier extends Command {
    private final CashierID cashierID;
    private final Name name;

    public CreateCashier(CashierID cashierID, Name name) {
        this.cashierID = cashierID;
        this.name = name;
    }

    public CashierID getCashierID() {
        return cashierID;
    }

    public Name getName() {
        return name;
    }
}
