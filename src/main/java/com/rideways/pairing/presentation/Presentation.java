package com.rideways.pairing.presentation;

public class Presentation {

    private String title;
    private String minutesString;
    private boolean lightningTalk = false;
    private int minutes;

    public Presentation(String title, String minutesString) {
        this.title = title;
        this.minutesString = minutesString;

        if (minutesString.equals("lightning")) {
            lightningTalk = minutesString.equals("lightning");
            minutes = 5;
        } else {
            minutes = Integer.valueOf(minutesString.replace("min", ""));
        }
    }

    public String getTitle() {
        return title;
    }

    public String getMinutesString() {
        return minutesString;
    }

    public boolean isLightningTalk() {
        return lightningTalk;
    }

    public int getMinutes() {
        return minutes;
    }
}
