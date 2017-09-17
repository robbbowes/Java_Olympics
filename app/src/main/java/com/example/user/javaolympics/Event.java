package com.example.user.javaolympics;

import java.util.ArrayList;

/**
 * Created by user on 17/09/2017.
 */

public class Event {

    Enum<Discipline> eventDiscipline;
    ArrayList<Team> competingTeams;
    int maxTeamSize;

    public Event(Enum<Discipline> eventDiscipline, ArrayList<Team> competingTeams, int maxTeamSize) {
        this.eventDiscipline = eventDiscipline;
        this.competingTeams = competingTeams;
        this.maxTeamSize = maxTeamSize;
    }

    public Enum<Discipline> getEventDiscipline() {
        return eventDiscipline;
    }

    public ArrayList<Team> getCompetingTeams() {
        return competingTeams;
    }

    public void addToCompetingTeams(Team team) {
        if ( (team.getDiscipline() == this.getEventDiscipline() ) && (team.teamSize() < this.maxTeamSize) ) {
            competingTeams.add(team);
        }
    }

//    public Team winningTeam() {
//
//    }

//    public String getWinner() {
//        Team winner = competingTeams.get(0);
//        for (Team team : competingTeams){
//
//        }
//    }
}
