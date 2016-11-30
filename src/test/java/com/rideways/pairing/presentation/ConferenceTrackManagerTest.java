package com.rideways.pairing.presentation;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConferenceTrackManagerTest {

    private ConferenceTrackManager manager;

    @Test
    public void conferenceLunchtimeBetween12And1() {
        List<Presentation> presentations = new ArrayList<>();
        Schedule schedule = manager.generateSchedule(presentations);
        assertThat(schedule.getTrack(0).getSlot("12:00").getTitle(), is("Lunch"));
    }
}
