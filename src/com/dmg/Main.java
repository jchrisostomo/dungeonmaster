package com.dmg;

import com.dmg.entities.Card;
import com.dmg.entities.Character;
import com.dmg.entities.Dice;
import com.dmg.entities.Item;

public class Main {

    public static void main(String[] args) {
        System.out.println(".: DUNGEON MASTER v.0.0.1 :.");

        Card card0 = new Character(1,"Guerreiro Orc","O famoso guerreiro orc!",12,3,2,1);
        Card card1 = new Character(2,"Caçador Orc","Especialista em caçar humanos.",11,2,3,2);
        Card card2 = new Item(3,"Machado Orc","Um machado pesado.",5);

        System.out.println(card0);
        System.out.println(card1);
        System.out.println(card2);

        System.out.println("----------------------------------------");
        System.out.println("Rolagem d20: " + Dice.rollDice(20));
        System.out.println("Rolagem d2: " + Dice.rollDice(2));
        System.out.println("Rolagem d6: " + Dice.rollDice(6));
        System.out.println("Rolagem d100: " + Dice.rollDice(100));
        System.out.println("Linux d20: " + Dice.rollDice(20));
        System.out.println("----------------------------------------");
    }
}
