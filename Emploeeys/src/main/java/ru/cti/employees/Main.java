package main.java.ru.cti.employees;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<EmployeeAttribute> employeeList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String input = "";
        while (true){
            System.out.println("Введите информацию о сотруднике (фамилия, имя, возраст, пол, возраст, образование, " +
                    "должность, отдел) или END для окончания:");
            input = scanner.nextLine();
            if (input.toLowerCase().equals("end")) {
                System.out.printf("%-20s%-10s%-10s%-10s%-10s%-10s%-10s%n", "Фамилия", "Имя", "Возраст", "Пол", "Образование", "Должность", "Отдел");
                employeeList.forEach((user) -> showPerson(user));
                break;
            }
            try {
                employeeList.add(new EmployeeAttribute(input));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Вы ввели не все данные...");
                continue;
            }
        }
    }
    public static void showPerson (EmployeeAttribute user) {
        System.out.printf("%-20s%-10s%-10s%-10s%-10s%-10s%-10s%n",user.getFirstName(), user.getLastName(), user.getAge(), user.getGender(), user.getEducation(),  user.getPosition(),  user.getDepartment());
    }
}
