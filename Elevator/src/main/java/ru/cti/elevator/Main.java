package main.java.ru.cti.elevator;


import java.lang.invoke.StringConcatFactory;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> floors = new LinkedList<>();
        String route ="";

        while(true){
            System.out.println("Ожидаю ввода этажа: (для завершения введите 0)");
            try {
                int floorNum = scanner.nextInt();
                if (floorNum > 25) {
                    System.out.println("В доме всего 25 этажей");
                    continue;
                }

                if (floorNum == 0) {
                    System.out.println("Лифт последовал по этажам");
                    for (Integer floor: floors){
                        route += "этаж " + floor + " --> ";
                    }
                    System.out.println(route.substring(0, route.length()- 4));
                    break;
                }
                floors.offer(floorNum);
            }catch (InputMismatchException ex) {
                System.out.println("Номер этажа не может быть не числом.");
                scanner.nextLine();
                continue;
            }

        }
    }
}
