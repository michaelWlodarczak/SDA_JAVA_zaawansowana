package com.sda.basketball;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BasketballTeamApp {
    public static void main(String[] args) {
        BasketballTeam chicagoBulls = new BasketballTeam();

        Player jordan = new Player("Michael", "Jordan", 198);
        Player jordan2 = new Player("Michael", "Jordan", 198);


        System.out.println("Tacy sami " + jordan.equals(jordan2));

        chicagoBulls.addPlayer(jordan);
        chicagoBulls.addPlayer(jordan2);

        System.out.println(chicagoBulls.getPlayer());

        List<Player> playerList = new ArrayList<>();
        playerList.add(jordan);
        Player gortat = new Player("Marcin", "Gortat", 211);
        Player malysz = new Player("Adam","Malysz",170);
        playerList.add(malysz);
        playerList.add(gortat);

        System.out.println(playerList);
        playerList.sort(null);  // <- null bo pobiera comparator domyslny z klasy Player
        System.out.println(playerList);
        playerList.sort(Comparator.reverseOrder());
        System.out.println(playerList);
    }
}
