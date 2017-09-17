package com.example.user.javaolympics;

import java.util.ArrayList;

/**
 * Created by user on 17/09/2017.
 */

public class Team extends Competitor {

    ArrayList<Athlete> team;

    public Team(int goldMedalCount,
                int silverMedalCount,
                int bronzeMedalCount,
                Enum<Country> country,
                ArrayList<Athlete> team,
                Enum<Discipline> discipline) {
        super(goldMedalCount, silverMedalCount, bronzeMedalCount, country, discipline);

        this.team = team;
    }

    public ArrayList<Athlete> getTeam() {
        return team;
    }

    public void addToTeam(Athlete athlete) {
        if (athlete.getDiscipline() == this.discipline){
            team.add(athlete);
        }
    }

    public int teamSize() {
        return team.size();
    }

}
