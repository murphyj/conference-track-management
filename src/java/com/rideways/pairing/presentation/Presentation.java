package com.rideways.pairing.presentation;

public class Presentation {

    private String title;
    private String minutesString;
    private boolean lightningTalk = false;

    public Presentation(String title, String minutesString) {
        this.title = title;
        this.minutesString = minutesString;

        lightningTalk = minutesString.equals("lightning");
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
}
