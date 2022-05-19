package com.zen.dddpracticemodel.store.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.zen.dddpracticemodel.store.values.Description;

public class HolidayDescriptionUpdated extends DomainEvent {
    private final Description description;

    public HolidayDescriptionUpdated(Description description) {
        super("com.zen.dddpracticemodel.holidaydescriptionupdated");

        this.description = description;
    }

    public Description getDescription() {
        return description;
    }
}
