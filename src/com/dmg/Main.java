package com.dmg;

import com.dmg.entities.Card;

public class Main {

    public static void main(String[] args) {
        System.out.println(".: DUNGEON MASTER v.0.0.1 :.");

        Card card0 = new Card(1,"Guerreiro Orc","O famoso guerreiro orc!");
        Card card1 = new Card(2,"Caçador Orc","Especialista em caçar humanos.");
        Card card2 = new Card(3,"Machado Orc","Um machado pesado.");

        System.out.println(card0);
        System.out.println(card1);
    }
}
