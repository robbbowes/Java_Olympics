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
        Team team = new Team(3, 4, 1, Country.BRITAIN, teamgb, Discipline.JAVELIN);
        ArrayList<Competitor> javelinteams = new ArrayList<>();
        javelinteams.add(team);
        Event javelinevent = new Event(Discipline.JAVELIN, javelinteams, 2);
        assertEquals(1, javelinevent.competitors.size());
    }

    @Test
    public void canAddAthlete() {
        Athlete johnsmith = new Athlete(0, 0, 0, Country.BRITAIN, "John Smith", 8, Discipline.JAVELIN);
        ArrayList<Athlete> teamgb = new ArrayList<>();
        Event javelinevent = new Event(Discipline.JAVELIN, null, 2);
        javelinevent.addAthleteToCompetitors(johnsmith);
        assertEquals(javelinevent.getCompetingTeams().size(), 1);
    }


    @Test
    public void canGetWinner() {
        Athlete johnsmith = new Athlete(0, 0, 0, Country.BRITAIN, "John Smith", 8, Discipline.JAVELIN);
        Athlete stevenberry = new Athlete(0, 0, 0, Country.BRITAIN, "Steven Berry", 8, Discipline.JAVELIN);
        ArrayList<Athlete> gbathletes = new ArrayList<>();
        gbathletes.add(johnsmith);
        gbathletes.add(stevenberry);
        Team teamgb = new Team(3, 4, 1, Country.BRITAIN, gbathletes, Discipline.JAVELIN );

        Athlete reneeblin = new Athlete(0, 0, 0, Country.FRANCE, "Renée Blin", 7, Discipline.JAVELIN);
        Athlete francoisberthaud = new Athlete(0, 0, 0, Country.FRANCE, "François Bethaud", 7, Discipline.JAVELIN);
        ArrayList<Athlete> frathletes = new ArrayList<>();
        frathletes.add(francoisberthaud);
        frathletes.add(reneeblin);
        Team teamfr = new Team(2, 5, 0, Country.FRANCE, frathletes, Discipline.JAVELIN );

        ArrayList<Competitor> javelincompetitors = new ArrayList<>();
        javelincompetitors.add(teamfr);
        javelincompetitors.add(teamgb);

        Event javelinevent = new Event(Discipline.JAVELIN, javelincompetitors, 2 );

        assertEquals( teamgb, javelinevent.winner() );
        assertEquals( 4, teamgb.getGoldMedalCount());
    }
}
