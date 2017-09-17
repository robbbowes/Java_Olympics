package com.example.user.javaolympics;

/**
 * Created by user on 15/09/2017.
 */

public abstract class Competitor {
    int goldMedalCount;
    int silverMedalCount;
    int bronzeMedalCount;
    Enum<Country> country;
    Enum<Discipline> discipline;

    public Competitor(int goldMedalCount,
                      int silverMedalCount,
                      int bronzeMedalCount,
                      Enum<Country> country,
                      Enum<Discipline> discipline) {
        this.goldMedalCount = goldMedalCount;
        this.silverMedalCount = silverMedalCount;
        this.bronzeMedalCount = bronzeMedalCount;
        this.country = country;
        this.discipline = discipline;
    }

    public Enum<Country> getCountry() {
        return country;
    }

    public int getGoldMedalCount() {
        return goldMedalCount;
    }

    public int getSilverMedalCount() {
        return silverMedalCount;
    }

    public int getBronzeMedalCount() {
        return bronzeMedalCount;
    }

    public Enum<Discipline> getDiscipline() {
        return discipline;
    }

    public void awardBronze() {
        this.bronzeMedalCount++;
    }

    public void awardSilver() {
        this.silverMedalCount++;
    }

    public void awardGold() {
        this.goldMedalCount++;
    }

    public int howManyMedals() {
        return bronzeMedalCount + silverMedalCount + goldMedalCount;
    }

    public abstract double getSkill();
}
