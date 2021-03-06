package main.java.ru.netology.supermarket;

import java.lang.System;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class SuperMarket {
    public static void main (String[] args)
    {
        HashMap result = new HashMap();
        Scanner reader = new Scanner(System.in);
        //Массив продуктов
        ArrayList<String> productsLst = new ArrayList<>();
        productsLst.add("творог");
        productsLst.add("греческий йогурт");
        productsLst.add("геркулес монастырский");
        productsLst.add("изюм");
        //Массив цен
        ArrayList costsLst = new ArrayList();
        costsLst.add(80);
        costsLst.add(37);
        costsLst.add(49);
        costsLst.add(200);
        //Сигнал остановки
        String neededProduct = "";

        while(!neededProduct.equals("стоп")){
            System.out.println("Введите продукт: ");
            neededProduct = reader.next().toLowerCase();
            if (!productsLst.contains(neededProduct)) {
                if (!neededProduct.toLowerCase().equals("стоп"))
                    System.out.println("Нет в наличии.");
                continue;
            }
            int quantity;
            System.out.println("Введите количество: ");
            while (true) {
                try {
                    quantity = reader.nextInt();
                    break;
                } catch (Exception ex) {
                    System.out.println("Вы ввели не число! Попробуйте ещё раз: ");
                    reader.next();
                    continue;
                }
            }
            result.put(neededProduct, Integer.parseInt(costsLst.get(productsLst.indexOf(neededProduct)).toString())*quantity);
        }
        System.out.println(result.toString());
    }
}
