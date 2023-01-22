package org.example;

public class Game {

    public void playing() {
        FirstPlayer firstPlayer = new FirstPlayer();
        boolean flag = firstPlayer.firstPlayer();
        StateGame stateGame = new StateGame();
        PrintState print = new PrintState();
        while (true) {
            if (flag) {
                System.out.println("Ваш ход...");
                Player player = new Player();
                player.player();
                flag = false;

            } else {
                System.out.println("играет компьютер...");
                Computer comp = new Computer(stateGame.getCandies(), stateGame.getComputerScore());
                comp.computer();
                stateGame.setCandies(comp.getCandies());
                stateGame.setComputerScore(comp.getComputerScore());
                flag = true;
            }
            System.out.println(print.printCandies());
            System.out.println(print.printPlayerScore());
            System.out.println(print.printComputerScore());

            if (stateGame.getCandies() == 0) {
                if (firstPlayer.isFlag()) {
                    System.out.println("Победил компьютер!");
                } else {
                    System.out.println("Вы победили! Ура!");
                }
                break;
            }
        }
    }
}
