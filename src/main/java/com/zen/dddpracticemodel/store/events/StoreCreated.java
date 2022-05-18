package com.zen.dddpracticemodel.store.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.zen.dddpracticemodel.store.values.BusinessDays;

public class StoreCreated extends DomainEvent {
    private final BusinessDays businessDays;

    public StoreCreated(BusinessDays businessDays) {
        super("com.zen.dddpracticemodel.StoreCreated");
        this.businessDays = businessDays;
    }

    public BusinessDays BusinessDays() {
        return businessDays;
    }

}
