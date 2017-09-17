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
        athlete = new Athlete(0, 0, 0, Country.BRITAIN, "John Smith", 8, Discipline.JAVELIN);
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

    @Test
    public void hasDiscipline() {
        assertEquals( Discipline.JAVELIN, athlete.getDiscipline());
    }

    @Test
    public void awardBronze() {
        athlete.awardBronze();
        assertEquals( 1, athlete.bronzeMedalCount);
    }

    @Test
    public void awardSilver() {
        athlete.awardSilver();
        assertEquals(1, athlete.silverMedalCount);
    }

    @Test
    public void awardGold() {
        athlete.awardGold();
        assertEquals(1, athlete.goldMedalCount);
    }

    @Test
    public void award2Bronzes1SilverAnd3Golds() {
        athlete.awardBronze();
        athlete.awardBronze();
        athlete.awardSilver();
        athlete.awardGold();
        athlete.awardGold();
        athlete.awardGold();
        assertEquals(6, athlete.howManyMedals());
        assertEquals(2, athlete.bronzeMedalCount);
        assertEquals(1, athlete.silverMedalCount);
        assertEquals(3, athlete.goldMedalCount);
    }
}
