package main.java.ru.cti.commandPatterns.command;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        StartCar startCar = new StartCar(car);
        StopCar stopCar = new StopCar(car);
        CarInvoker carInvoker = new CarInvoker(startCar);
        CarInvoker carStopInvoker = new CarInvoker(stopCar);
        carInvoker.execute();
        carStopInvoker.execute();
    }
}
