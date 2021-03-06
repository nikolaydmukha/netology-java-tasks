package main.java.ru.cti.game;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        // Как настоящие программисты мы имеем в виду, что исчисление начинается с 0
        System.out.format("У игрока %d слотов с оружием,"
                        + " введите номер, чтобы выстрелить,"
                        + " -1 чтобы выйти%n",
                player.getSlotsCount()
        );
        int slot;

        // TODO главный цикл игры:
        // запрашивать номер с клавиатуры
        // с помощью scanner.nextInt(),
        // пока не будет введено -1
        while (true) {
//            int slot;
            try {
                slot = scanner.nextInt();

            } catch (InputMismatchException ex) {
                System.out.println("Вы ввели не число! ");
                break;
            }
            if (slot != -1){
                System.out.println("SHOT!!!!");
                player.shotWithWeapon(slot);
            }
            else {
                System.out.println("Game over!");
                break;
            }
        }
    }
}
