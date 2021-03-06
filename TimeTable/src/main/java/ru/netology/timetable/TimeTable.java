package main.java.ru.netology.timetable;

import java.lang.System;
import java.util.ArrayList;
import java.util.Scanner;

public class TimeTable {

    public static void showMsg(String arg)
    {
        System.out.println(arg);
    }
    public static void main(String[] args) {

        ArrayList<Transport> allTransportInfo = new ArrayList();
        Transport transport = new Transport("Bus", 11, "11:00");
//        transport.getTransportInfo();
        String inputTransportType = "";
        int inputRouteNumber = 0;
        String inputArrivalDate;
        while(true){
            Scanner reader = new Scanner(System.in);
            showMsg("Введите тип транспорта: ");
            inputTransportType = reader.nextLine();
            if (inputTransportType.equals("стоп"))
                break;
            showMsg(("Введите номер маршртуа следования: "));
            while (true) {
                try {
                    inputRouteNumber = reader.nextInt();
                    break;
                } catch (Exception ex) {
                    showMsg("Нужно ввести числовой номер:");
                    reader.next();
                    continue;
                }
            }
            showMsg("Введите дату прибытия транспорта: ");
            reader.nextLine();
            inputArrivalDate = reader.nextLine();

            allTransportInfo.add(new Transport(inputTransportType, inputRouteNumber, inputArrivalDate));
        }
        for (Transport num : allTransportInfo) {
            num.getTransportInfo();
        }
    }
}
