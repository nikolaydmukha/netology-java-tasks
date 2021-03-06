package main.java.ru.cti.commandPatterns.command;

public class CarInvoker {
    public ICommand command;
    public CarInvoker(ICommand command){
        this.command = command;
    }
    public void execute(){
        this.command.execute();
    }
}
