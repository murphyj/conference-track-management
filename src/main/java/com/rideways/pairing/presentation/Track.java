package com.rideways.pairing.presentation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Timer;

public class Track {

    Map<String, Presentation> trackSchedule = new LinkedHashMap<String, Presentation>();

    public static final Presentation LUNCH = new Presentation("Lunch", "60min");

    public Track() {
        setSlot("12:00", LUNCH);
    }

    private void setSlot(String time, Presentation presentation) {
        
    }

    public Presentation getSlot(String slot) {
        return null;
    }
}
