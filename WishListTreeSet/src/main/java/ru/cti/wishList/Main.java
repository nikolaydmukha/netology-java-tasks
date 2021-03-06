package main.java.ru.cti.wishList;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
//        TreeSet<Wish> wishTreeSet = new TreeSet<Wish>();
//        wishTreeSet.add(new Wish("MacBook", "laptop", 1200.00, "http://apple.com", 5));
//        wishTreeSet.add(new Wish("HP", "laptop", 1100.00, "http://hp.com", 3));
//        wishTreeSet.add(new Wish("Iphone XS", "smartphone", 1000.00, "http://apple.com", 5));
//        wishTreeSet.add(new Wish("Mercedes-Benz", "car", 12000.00, "http://mbenz.com", 5));
//
//        for (Wish item:wishTreeSet) {
//            System.out.println(item.getName());
//
//        }
        WishComparator wcomp = new WishComparator();
        TreeSet<Wish> wishTreeSet = new TreeSet<Wish>(wcomp);
        wishTreeSet.add(new Wish("MacBook", "laptop", 1200.00, "http://apple.com", 5));
        wishTreeSet.add(new Wish("HP", "laptop", 1100.00, "http://hp.com", 3));
        wishTreeSet.add(new Wish("Iphone XS", "smartphone", 1000.00, "http://apple.com", 5));
        wishTreeSet.add(new Wish("Mercedes-Benz", "car", 12000.00, "http://mbenz.com", 5));
        System.out.println("Общий компаратор: ");
        for(Wish  p : wishTreeSet){
            System.out.println(p.getName() + " " + p.getPrice() + " " + p.getPriority());
        }

        WishPriceComparator pcomp = new WishPriceComparator();
        TreeSet<Wish> wishTreeSet1 = new TreeSet<Wish>(pcomp);
        wishTreeSet1.add(new Wish("MacBook", "laptop", 1200.00, "http://apple.com", 5));
        wishTreeSet1.add(new Wish("HP", "laptop", 1100.00, "http://hp.com", 3));
        wishTreeSet1.add(new Wish("Iphone XS", "smartphone", 1000.00, "http://apple.com", 5));
        wishTreeSet1.add(new Wish("Mercedes-Benz", "car", 12000.00, "http://mbenz.com", 5));
        System.out.println("\nКомпаратор по цене: ");
        for(Wish  p : wishTreeSet1){
            System.out.println(p.getName() + " " + p.getPrice() + " " + p.getPriority());
        }

        Comparator prcomp = new WishPriorityComparator().thenComparing(new WishPriceComparator());
        TreeSet<Wish> wishTreeSet2 = new TreeSet<Wish>(prcomp);
        wishTreeSet2.add(new Wish("MacBook", "laptop", 1200.00, "http://apple.com", 5));
        wishTreeSet2.add(new Wish("HP", "laptop", 1100.00, "http://hp.com", 3));
        wishTreeSet2.add(new Wish("Iphone XS", "smartphone", 1000.00, "http://apple.com", 5));
        wishTreeSet2.add(new Wish("Mercedes-Benz", "car", 12000.00, "http://mbenz.com", 5));
        System.out.println("\nКомпаратор по приоритету: ");
        for(Wish  p : wishTreeSet2){
            System.out.println(p.getName() + " " + p.getPrice() + " " + p.getPriority());
        }
    }
}
