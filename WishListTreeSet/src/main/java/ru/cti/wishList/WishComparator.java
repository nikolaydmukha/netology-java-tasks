package main.java.ru.cti.wishList;

import java.util.Comparator;

public class WishComparator implements Comparator<Wish> {
    public int compare(Wish a, Wish b) {
        return a.getPrice().compareTo(b.getPrice());
    }
}