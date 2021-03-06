package main.java.ru.cti.commandPatterns.command;

public class StopCar implements ICommand{
    Car car;
    public StopCar(Car car) {
        this.car = car;
    }
    public void execute() {
        car.stopEngine();
    }
}
