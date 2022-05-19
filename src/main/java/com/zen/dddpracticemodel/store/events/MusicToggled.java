package com.zen.dddpracticemodel.store.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.zen.dddpracticemodel.store.values.Music;

public class MusicToggled extends DomainEvent {
    private final Music music;

    public MusicToggled(Music music) {
        super("com.zen.dddpracticemodel.musictoggled");
        this.music = music;
    }

    public Music getMusic() {
        return music;
    }
}
