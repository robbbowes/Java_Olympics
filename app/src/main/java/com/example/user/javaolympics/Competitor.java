package com.example.user.javaolympics;

/**
 * Created by user on 15/09/2017.
 */

public abstract class Competitor {
    int goldMedalCount;
    int silverMedalCount;
    int bronzeMedalCount;
    Enum<Country> country;

    public Competitor(int goldMedalCount, int silverMedalCount, int bronzeMedalCount, Enum<Country> country) {
        this.goldMedalCount = goldMedalCount;
        this.silverMedalCount = silverMedalCount;
        this.bronzeMedalCount = bronzeMedalCount;
        this.country = country;
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

}
