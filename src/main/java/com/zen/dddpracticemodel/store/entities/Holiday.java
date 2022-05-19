package com.zen.dddpracticemodel.store.entities;

import co.com.sofka.domain.generic.Entity;
import com.zen.dddpracticemodel.store.values.Decoration;
import com.zen.dddpracticemodel.store.values.Description;
import com.zen.dddpracticemodel.store.values.HolidayID;
import com.zen.dddpracticemodel.store.values.Music;

import java.util.Objects;

public class Holiday extends Entity<HolidayID> {

    protected Description description;
    protected Music music;
    protected Decoration decoration;
    public Holiday(HolidayID entityId, Description description, Music music, Decoration decoration) {
        super(entityId);
        this.description = description;
        this.music = music;
        this.decoration = decoration;
    }

    private Holiday(HolidayID entityId) {
        super(entityId);
    }

    public Description getDescription() {
        return description;
    }

    public void updateDescription(Description description) {
        this.description = description;
    }

    public Music getMusic() {
        return music;
    }

    public void changeMusic(Music music) {
        this.music = music;
    }

    public Decoration getDecoration() {
        return decoration;
    }

    public void updateDecoration(Decoration decoration) {
        this.decoration = decoration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Holiday holiday = (Holiday) o;
        return Objects.equals(description, holiday.description) && Objects.equals(music, holiday.music) && Objects.equals(decoration, holiday.decoration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), description, music, decoration);
    }
}
