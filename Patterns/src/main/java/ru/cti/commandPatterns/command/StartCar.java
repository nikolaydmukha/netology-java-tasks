package main.java.ru.cti.commandPatterns.command;

public class StartCar implements ICommand{
    Car car;
    public StartCar(Car car) {
        this.car = car;
    }
    public void execute() {
        car.startEngine();
    }
}
