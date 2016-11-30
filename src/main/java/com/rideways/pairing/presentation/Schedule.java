package com.rideways.pairing.presentation;

import java.util.ArrayList;
import java.util.List;

public class Schedule {

    List<Track> tracks = new ArrayList<>();

    public Track getTrack(int trackNumber) {
        return tracks.get(trackNumber);
    }

    public void addTrack(Track track) {

    }
}
