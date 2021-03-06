package main.java.ru.cti.wishList;

public class Wish implements Comparable<Wish>{
    private String name;
    private String description;
    private Double price;
    private int priority;
    private String url;

    public Wish(String name, String description, Double price, String url, int priority) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.url = url;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }

    public int getPriority() {
        return priority;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public int compareTo(Wish o) {
        return price.compareTo(o.getPrice());
    }
}
