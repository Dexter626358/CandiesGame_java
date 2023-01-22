package org.example;

public class Menu {
    private final String welcome;
    private final String menu;

    public Menu() {
        welcome = "Добро пожаловать в игру";
        menu = "1. Начать игру.\n 2. Посмотреть счет.\n 3. Сохранить текущее состояние игры.\n 4. Выход.\n";
    }

    public void greetings() {
        System.out.println(welcome);

    }

    public void menu() {
        System.out.println(menu);
    }
}
