package main.java.ru.cti.wishList;

import java.util.Comparator;

public class WishPriorityComparator implements Comparator<Wish> {
    public int compare(Wish a, Wish b) {
        if (a.getPriority() > b.getPriority())
            return 1;
        else if (a.getPriority() < b.getPriority())
            return -1;
        else
            return 0;
    }
}
