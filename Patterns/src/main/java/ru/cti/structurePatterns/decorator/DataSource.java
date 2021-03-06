package main.java.ru.cti.structurePatterns.decorator;

public interface DataSource {
    void writeData(String data);

    String readData();
}
