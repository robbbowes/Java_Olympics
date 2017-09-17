package com.example.user.javaolympics;

/**
 * Created by user on 15/09/2017.
 */

public class Athlete extends Competitor{

    String name;
    int skill;

    public Athlete(int goldMedalCount,
                   int silverMedalCount,
                   int bronzeMedalCount,
                   Enum<Country> country,
                   String name,
                   int skill,
                   Enum<Discipline> discipline) {
        super(goldMedalCount,
                silverMedalCount,
                bronzeMedalCount,
                country,
                discipline);

        this.name = name;
        this.skill = skill;
    }

    public String getName() {
        return name;
    }

    public int getSkill() {
        return skill;
    }

}