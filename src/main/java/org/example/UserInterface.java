package org.example;

import java.util.Scanner;

public class UserInterface {

    public void startGame() {
        Menu menu = new Menu();
        menu.greetings();
        menu.menu();
        Scanner scan = new Scanner(System.in);
        String userInput = scan.next();
        switch (userInput) {
            case "1":
                System.out.println("Начинаем игру");
                Game game = new Game();
                game.playing();
                break;
            case "2":
                System.out.println("Показываю счет");
                break;
            case "3":
                System.out.println("Идет сохранение игры");
                break;
            case "4":
                System.out.println("Выход");
                break;
            default:
                System.out.println("Не корректное значение. Попробуйте снова");
                break;
        }

    }
}
