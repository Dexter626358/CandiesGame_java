package org.example;

public class PrintState {
    StateGame stateGame;

    public PrintState(){
        stateGame = new StateGame();
    }

    public String printCandies() {
        return "Осталось " +  stateGame.getCandies() + " конфет";
    }

    public String printComputerScore() {
        return "У компьютера " + stateGame.getComputerScore() + " конфет";
    }

    public String printPlayerScore() {
        return "У Вас " + stateGame.getPlayerScore() + " конфет";
    }

}
