package org.example;

public class StateGame {
    private int candies;
    private int computerScore;
    private int playerScore;
    private boolean end;

    public StateGame(){
        candies = 2021;
        computerScore = 0;
        playerScore = 0;
        end = true;
    }

    public int getCandies() {
        return candies;
    }

    public int getComputerScore() {
        return computerScore;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public boolean getEnd() {
        return end;
    }

    public void setCandies(int candies) {
        this.candies -= candies;
    }

    public void setEnd(boolean end) {
        this.end = end;
    }

    public void setComputerScore(int computerScore) {
        this.computerScore += computerScore;
    }

    public void setPlayerScore(int playerScore) {
        this.playerScore += playerScore;
    }
}
