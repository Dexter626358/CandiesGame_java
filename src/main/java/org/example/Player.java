package org.example;

import java.util.Scanner;

public class Player {
    StateGame stateGame;

    public Player(StateGame stateGame){
        this.stateGame = stateGame;
    }

    public void player() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество конфет: ");
        String ask_candies = scan.next();
        if (ask_candies.matches("^-?\\d+$")) {
            if (stateGame.getCandies() < Integer.parseInt(ask_candies)) {
                System.out.println("Слишком мало конфет. Попробуйте ввести другое число");
            } else {
                stateGame.setCandies(Integer.parseInt(ask_candies));
                stateGame.setPlayerScore(Integer.parseInt(ask_candies));
            }
        } else {
            System.out.println("Некорректный ввод. Попробуйте снова");
        }
    }
}
