package com.zen.dddpracticemodel.store.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.zen.dddpracticemodel.store.values.Decoration;
import com.zen.dddpracticemodel.store.values.Description;
import com.zen.dddpracticemodel.store.values.HolidayID;
import com.zen.dddpracticemodel.store.values.Music;

public class HolidayCreated extends DomainEvent {
    private final HolidayID entityId;
    private final Description description;
    private final Music music;
    private final Decoration decoration;

    public HolidayCreated(HolidayID entityId, Description description, Music music, Decoration decoration) {
        super("com.zen.dddpracticemodel.store.holidaycreated");
        this.entityId = entityId;
        this.description = description;
        this.music = music;
        this.decoration = decoration;
    }

    public HolidayID getEntityId() {
        return entityId;
    }

    public Description getDescription() {
        return description;
    }

    public Music getMusic() {
        return music;
    }

    public Decoration getDecoration() {
        return decoration;
    }
}
