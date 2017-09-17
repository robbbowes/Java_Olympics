package com.example.user.javaolympics;

import java.util.ArrayList;

/**
 * Created by user on 17/09/2017.
 */

public class Event {

    Enum<Discipline> eventDiscipline;
    ArrayList<Competitor> competitors;
    int maxTeamSize;

    public Event(Enum<Discipline> eventDiscipline, ArrayList<Competitor> competingTeams, int maxTeamSize) {
        this.eventDiscipline = eventDiscipline;
        this.competitors = competingTeams;
        this.maxTeamSize = maxTeamSize;
    }

    public Enum<Discipline> getEventDiscipline() {
        return eventDiscipline;
    }

    public ArrayList<Competitor> getCompetingTeams() {
        return competitors;
    }

    public void addTeamToCompetitors(Team team) {
        if ( (team.getDiscipline() == this.getEventDiscipline() ) && (team.teamSize() < this.maxTeamSize) ) {
            competitors.add(team);
        }
    }

    public void addAthleteToCompetitors(Athlete athlete) {
        if ( athlete.getDiscipline() == this.getEventDiscipline()) {
            competitors.add(athlete);
        }
    }

    public Competitor winner() {
        Competitor winner = competitors.get(0);
        for ( Competitor competitor : competitors ){
            double challengerSkill = competitor.getSkill();
            double winnersSkill = winner.getSkill();
            if (challengerSkill > winnersSkill){
                winner = competitor;
            }
        }
        winner.awardGold();
        return winner;
    }

}
