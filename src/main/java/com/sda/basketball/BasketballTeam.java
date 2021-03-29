package com.sda.basketball;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BasketballTeam {
    private Set<Player> team = new HashSet<>();

    public void addPlayer(Player player) {
        team.add(player);
    }

    public Set<Player> getPlayer() {
        return team;
    }
    // OPTIONAL
    /* public Player getHigherThan200 (){
        for (Player player : team){
            if (player.getHeight() >200){
                //Optional<Player> optionalPlayer = Optional.of(Player);
                return Optional.of(Player);
            }
        }
        return Optional.empty();
    } */

    public Set<Player> higherThen180() {  // metoda szukajaca graczy wyzszych niz 180
        Predicate<Player> predicate = new HigherThen180();
        Set<Player> passed = new HashSet<>();
        for (Player player : team) {
            if (predicate.test(player)) {
                passed.add(player);
            }
        }
        return passed;
    }
    public Set<Player> getHigherThan180SeparatePredicateClass(){
        Predicate<Player> higherThan180 = new HigherThen180();
        Set<Player> passed = new HashSet<>();

        passed = team.stream().filter(higherThan180).collect(Collectors.toSet());

        return passed;
    }
    public Set<Player> getHigherThan180(){
        //Najprostsza lambda
        Predicate<Player> higherThan180 = (Player player) -> {
            return player.getHeight() > 180;
        };
        Set<Player> passed = new HashSet<>();

        passed = team.stream().filter(higherThan180).collect(Collectors.toSet());

        return passed;
    }
}