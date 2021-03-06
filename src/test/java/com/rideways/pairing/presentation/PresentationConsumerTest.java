package com.rideways.pairing.presentation;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertTrue;

public class PresentationConsumerTest {

    private PresentationConsumer presentationConsumer;

    @Before
    public void setup() {
        presentationConsumer = new PresentationConsumer();
    }

    @Test
    public void readsSeminarsFromFile() {
        List<Presentation> presentations = presentationConsumer.consume();
        Presentation presentationOne = presentations.get(0);
        assertThat(presentationOne.getTitle(), is("Writing Fast Tests Against Enterprise Rails"));
        assertThat(presentationOne.getMinutesString(), is("60min"));
        assertThat(presentationOne.getMinutes(), is(60));
    }

    @Test
    public void readsSeminarsForLightningTalks() {
        List<Presentation> presentations = presentationConsumer.consume();
        Presentation presentation = presentations.get(5);
        assertTrue(presentation.isLightningTalk());
        assertThat(presentation.getMinutesString(), is("lightning"));
        assertThat(presentation.getMinutes(), is(5));
    }
}
