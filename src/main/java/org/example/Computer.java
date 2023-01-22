package org.example;

import java.util.Random;

public class Computer {
    int candies;
    int computerScore;

    public Computer(int candies, int computer_score) {
        this.candies = candies;
        this.computerScore = computer_score;
    }
    public void computer() {
        Random rnd = new Random();
        if (candies > 55) {
            int ask_candies = rnd.nextInt(1, 28);
            candies -= ask_candies;
            computerScore += ask_candies;
        } else if (candies > 28 && candies <= 55) {
            int ask_candies = candies % 28;
            candies -= ask_candies;
            computerScore += ask_candies;
        } else {
            computerScore += candies;
            candies -= candies;
        }

    }

    public int getCandies() {
        return candies;
    }

    public int getComputerScore() {
        return computerScore;
    }
}
