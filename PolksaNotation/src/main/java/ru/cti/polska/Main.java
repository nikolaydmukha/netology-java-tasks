package main.java.ru.cti.polska;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Queue operandsQueue = new LinkedList();
        Queue operatorsQueue = new LinkedList();
        Scanner scanner =new Scanner(System.in);
        String example = "";
        ArrayList<Character> operators = new ArrayList<>();
       operators.add('+');
       operators.add('-');
       operators.add('/');
       operators.add('*');

        while(true) {
            System.out.println("Введите пример для перевода в польскую нотацию или END для зевершения: ");
            example = scanner.nextLine();
            if(example.toLowerCase().equals("end")) {
                break;
            }
            ArrayList<Character> chars = new ArrayList<>();
            for (char c : example.toCharArray()) {
                chars.add(c);
            }
            System.out.println(chars.toString());
            for (int i = 0; i<chars.size(); i++){
                if(i == 0) {
                    if (operators.contains(chars.get(i))) {
                        char swap = chars.get(i);
                        chars.set(i, chars.get(i + 1));
                        chars.set(i + 1, swap);
//                    if (example.charAt(i) == '*' || example.charAt(i) == '/') {
//                        System.out.println("1st " + example.charAt(i));
//                        operandsQueue.offer(example.charAt(i));
//                        continue;
//                    }
//                    else {
//                        System.out.println("2nd " + example.charAt(i));
                        operatorsQueue.offer(chars.get(i));
//                        }

                    }
                }
                else {
                    if (operators.contains(chars.get(i)) && !operators.contains(chars.get(i - 1))) {
                        System.out.println("DDDD");
                        char swap = chars.get(i+1);
                        chars.set(i + 1, chars.get(i));
                        chars.set(i, swap);

                    }
                    else {
                        char swap = chars.get(i+1);
                        chars.set(i + 1, chars.get(i));
                        chars.set(i, swap);
                    }
                }
                System.out.println(chars.toString());
//                else {
//                    System.out.println("3rd " + example.charAt(i));
//                    operandsQueue.offer(example.charAt(i));
//                }
            }
            String polskaType = "";
            for (Object op:operandsQueue) {
                polskaType += op;
            }
            for (Object sign:operatorsQueue) {
                polskaType += sign;
            }
            System.out.println(polskaType);

        }
    }
}
