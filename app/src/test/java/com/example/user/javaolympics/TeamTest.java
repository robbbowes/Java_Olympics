package com.example.user.javaolympics;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


/**
 * Created by user on 17/09/2017.
 */

public class TeamTest {

//    Team team;
//    @Before
//    public void before() {
//        Athlete johnsmith = new Athlete(0, 0, 0, Country.BRITAIN, "John Smith", 8);
//        Athlete stevenberry = new Athlete(0, 0, 0, Country.BRITAIN, "Steven Berry", 7);
//        Athlete andrewmcguinness = new Athlete(0, 0, 0, Country.BRITAIN, "Andrew McGuinness", 9);
//        ArrayList<Athlete> teamgb = new ArrayList<>();
//        teamgb.add(johnsmith);
//        teamgb.add(stevenberry);
//        teamgb.add(andrewmcguinness);
//        Team team = new Team(0, 0, 0, Country.BRITAIN, teamgb );
//    }

    @Test
    public void hasNoBronzeMedals() {
        Athlete johnsmith = new Athlete(0, 0, 0, Country.BRITAIN, "John Smith", 8);
        Athlete stevenberry = new Athlete(0, 0, 0, Country.BRITAIN, "Steven Berry", 7);
        Athlete andrewmcguinness = new Athlete(0, 0, 0, Country.BRITAIN, "Andrew McGuinness", 9);
        ArrayList<Athlete> teamgb = new ArrayList<>();
        teamgb.add(johnsmith);
        teamgb.add(stevenberry);
        teamgb.add(andrewmcguinness);
        Team team = new Team(0, 0, 0, Country.BRITAIN, teamgb );
        assertEquals(0, team.getBronzeMedalCount() );
    }




}
