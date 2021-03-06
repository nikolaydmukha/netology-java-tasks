package main.java.ru.netology.timetable;

public class Transport {
    private  String transportType;
    private int routeNumber;
    private String arrivalDate;

    public Transport (String transportType, int routeNumber, String arrivalDate) {
        this.transportType = transportType;
        this.routeNumber = routeNumber;
        this.arrivalDate = arrivalDate;
    }
    void getTransportInfo() {
        System.out.printf("%6s №%6s %6s%n", this.transportType, this.routeNumber, this.arrivalDate);
    }
}
