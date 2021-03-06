package main.java.ru.cti.todoList;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String > todoList = new ArrayList<>();
        int action = -1;
        while (action !=0){
            System.out.println("Выберите действие:\n" +
                    "1. Добавить задачу\n" +
                    "2. Вывести список задач\n" +
                    "3. Удалить задачу\n" +
                    "0. Выход");
            action = scanner.nextInt();
            switch (action){
                case 1:
                    addTask(todoList, scanner);
                    break;
                case 2:
                    showTasks(todoList);
                    break;
                case 3:
                    removeTask(todoList, scanner);
                    break;
                default:
                    break;
            }
            continue;
        }
    }
    public static void addTask(ArrayList<String> todoList, Scanner scanner){
        scanner.nextLine();
        System.out.println("Введите задачу, которую хотите добавить...\n");
        String task = scanner.nextLine();
        todoList.add(task);
    }
    public static void showTasks(ArrayList<String> todoList){
        System.out.println("Вот весь список ваших задач на текущий момент\n");
        for (int i=0; i < todoList.size(); i++) {
            System.out.println("№" + i + " - "+ todoList.get(i));
        }
    }
    public static void removeTask(ArrayList<String> todoList, Scanner scanner) {
        showTasks(todoList);
        System.out.println("Введите номер задачи для удаения...\n");
        int num = scanner.nextInt();
        todoList.remove(num);
    }
}
