package org.example;

import java.util.Random;

public class Computer {
    StateGame stateGame;

    public Computer(StateGame stateGame){
        this.stateGame = stateGame;
    }
    public void computer() {
        Random rnd = new Random();
        int ask_candies = rnd.nextInt(1, 28);
        if (stateGame.getCandies() > 55) {
            stateGame.setCandies(ask_candies);
            stateGame.setComputerScore(ask_candies);
        } else if (stateGame.getCandies() > 28 && stateGame.getCandies() <= 55) {
            ask_candies = stateGame.getCandies() % 28;
            stateGame.setCandies(ask_candies);
            stateGame.setComputerScore(ask_candies);
        } else {
            stateGame.setComputerScore(ask_candies);
            stateGame.setCandies(ask_candies);
        }
    }
}
