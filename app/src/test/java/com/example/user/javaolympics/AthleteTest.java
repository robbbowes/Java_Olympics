package com.example.user.javaolympics;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by user on 17/09/2017.
 */

public class AthleteTest {

    Athlete athlete;
    @Before
    public void before() {
        athlete = new Athlete(0, 0, 0, Country.BRITAIN, "John Smith", 8);
    }

    @Test
    public void hasAName() {
        assertEquals("John Smith", athlete.getName());
    }

    @Test
    public void hasNoBronzeMedals() {
        assertEquals(0, athlete.getBronzeMedalCount());
    }

    @Test
    public void hasNoSilverMedals() {
        assertEquals(0, athlete.getSilverMedalCount());
    }

    @Test
    public void hasNoGoldMedals() {
        assertEquals(0, athlete.getGoldMedalCount());
    }

    @Test
    public void hasACountry() {
        assertEquals(Country.BRITAIN, athlete.getCountry());
    }

    @Test
    public void hasSkillLevel() {
        assertEquals(8, athlete.getSkill());
    }
}
