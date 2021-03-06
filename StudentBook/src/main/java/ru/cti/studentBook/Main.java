package main.java.ru.cti.studentBook;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws MySetException {
        HashSet<Student> studentsSet = new HashSet<>();

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Введите информацию о студенте: \"ФИО, номер группы, номер студенческого билета\" или НЕТ " +
                    "для завершения: ");
            String studentInfo = scanner.nextLine();
            if (studentInfo.equals("нет")) {
                break;
            }
            String[] parsedData = studentInfo.split(",");
            try {
                Student addedStudent = new Student(parsedData[0].trim(), parsedData[1].trim(), parsedData[2].trim());
                try {
                    if(!studentsSet.contains(addedStudent)) {
                        studentsSet.add(addedStudent);
                    } else {
                        throw new MySetException("Дубль!");
                    }
                } catch (Exception e) {
                    System.out.println("Вы уже его добавили!");
                }
            }catch (IndexOutOfBoundsException ex) {
                System.out.println("Или вы указали не все данные, или использовали разделитель на ЗАПЯТАЯ!");
            }
        }
        for (Student student : studentsSet) {
            System.out.print("ФИО: " + student.getName() + " Группа: " + student.getGroup() + "Номер студенческого:  " + student.getStudentId() + "\n");
        }
    }
}
