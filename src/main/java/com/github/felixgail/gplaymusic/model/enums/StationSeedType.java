package com.github.felixgail.gplaymusic.model.enums;

import com.github.felixgail.gplaymusic.model.shema.*;
import com.google.gson.annotations.SerializedName;

import java.lang.reflect.Type;

public enum StationSeedType {
    @SerializedName("2")
    TRACK(2, "trackId", Track.class),
    @SerializedName("3")
    ARTIST(3, "artistId", Artist.class),
    @SerializedName("4")
    ALBUM(4, "albumId", Album.class),
    @SerializedName("5")
    GENRE(5, "genreId", Genre.class),
    @SerializedName("8")
    PLAYLIST(8, "playlistShareToken", Playlist.class),
    @SerializedName("9")
    CURATED_STATION(9, "curatedStationId", Station.class);

    private int id;
    private String key;
    private Type seedClass;

    StationSeedType(int id, String key, Type seedClass) {
        this.id = id;
        this.key = key;
        this.seedClass = seedClass;
    }

    public int getId() {
        return id;
    }

    public String getKey() {
        return key;
    }

    public Type getSeedClass() {
        return seedClass;
    }
}
