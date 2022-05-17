package com.zen.dddpracticemodel.store.entities;

import co.com.sofka.domain.generic.Entity;
import com.zen.dddpracticemodel.store.values.EmployeeID;

public class Employee extends Entity<EmployeeID> {
    public Employee(EmployeeID entityId) {
        super(entityId);
    }
}
