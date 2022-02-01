package com.dmg.entities;
public class Dice {

    public static Integer rollDice(Integer sides) {
        return (int) (Math.random() * sides) +1;
    }

}
