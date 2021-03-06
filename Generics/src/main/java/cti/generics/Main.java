package main.java.cti.generics;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Box<String, String> stringBox = new Box<>("марка", "Мерседес");
        Box<String,String> characterBox = new Box<>("C", "модель");
        Box<String, Integer> integerBox = new Box<>("индекс",180);

        System.out.println(stringBox);
        System.out.println(characterBox);
        System.out.println(integerBox);

        ArrayList<Box<String, Integer>> list1 = new ArrayList<>();
        list1.add(integerBox);
        System.out.println(list1.get(0));
    }
}
