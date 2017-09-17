package com.example.user.javaolympics;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


/**
 * Created by user on 17/09/2017.
 */

public class EventTest {

//    @Before
//    public void before() {
//        Athlete johnsmith = new Athlete(0, 0, 0, Country.BRITAIN, "John Smith", 8, Discipline.JAVELIN);
//        Athlete stevenberry = new Athlete(0, 0, 0, Country.BRITAIN, "Steven Berry", 7, Discipline.JAVELIN);
//        ArrayList<Athlete> teamgb = new ArrayList<>();
//        teamgb.add(johnsmith);
//        teamgb.add(stevenberry);
//        Team team = new Team(3, 4, 1, Country.BRITAIN, teamgb, Discipline.JAVELIN );
//        ArrayList<Team> javelinteams = new ArrayList<>();
//        javelinteams.;
//        Event javelinevent = new Event(Discipline.JAVELIN, javelinteams, 2);
//    }

    @Test
    public void canAddATeam() {
        Athlete johnsmith = new Athlete(0, 0, 0, Country.BRITAIN, "John Smith", 8, Discipline.JAVELIN);
        Athlete stevenberry = new Athlete(0, 0, 0, Country.BRITAIN, "Steven Berry", 7, Discipline.JAVELIN);
        ArrayList<Athlete> teamgb = new ArrayList<>();
        teamgb.add(johnsmith);
        teamgb.add(stevenberry);
        Team team = new Team(3, 4, 1, Country.BRITAIN, teamgb, Discipline.JAVELIN );
        ArrayList<Team> javelinteams = new ArrayList<>();
        javelinteams.add(team);
        Event javelinevent = new Event(Discipline.JAVELIN, javelinteams, 2);
        assertEquals(1, javelinevent.competingTeams.size());
    }

    @Test



}
