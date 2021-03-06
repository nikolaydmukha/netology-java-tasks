package main.java.ru.cti.books;

public class Main {
    public static void main(String[] args) {
        //Initial params
        Books book1 = new Books();
        Books book2 = new Books();
        Books book3 = new Books();
        Books book4 = new Books();

        Author author1 = new Author("Александр", "Пушкин", 35);
        Author author2 = new Author("Николай", "Гоголь", 30, "Украина");
        Author author3 = new Author("Лев","Тослтой", 65, "Россия");
        Author author4 = new Author("Михаил","Булгаков", 45, "Россия");

        User user1 = new User("Николай", "Дмуха", "dmukha@mail.ru", "Профсоюзная 97-210");
        User user2 = new User("Юлия", "Дмуха", "j_dmukha@mail.ru", "Профсоюзная 97-210");

        //Create books
        book1.title = "Война и мир";
        book1.author = author3;
        book1.year = 1800;
        book1.pages = 2500;

        book2.title = "Мастер и маргарита";
        book2.author = author4;
        book2.year = 1850;
        book2.pages = 1800;

        book3.title = "Евгений Онегин";
        book3.author = author2;
        book3.year = 1812;
        book3.pages = 700;

        book4.title = "Мёртвые души";
        book4.author = author1;
        book4.year = 1746;
        book4.pages = 700;

        book1.toString();
        book2.toString();

        //Books pages compare
        System.out.println(book1.pagesCompare(book2));
        System.out.println(book1.pagesCompare(book3));
        System.out.println(book2.pagesCompare(book4));
        System.out.println(book3.pagesCompare(book2));
        System.out.println(book2.pagesCompare(book4));
        System.out.println(book3.pagesCompare(book4));

        //Create users
        System.out.println("Всего создано пользователей: " + User.totalUsers);

        user1.booksList.add(book1);
        user1.booksList.add(book3);
        user2.booksList.add(book2);
        user2.booksList.add(book4);

        System.out.println(user1.toString());
        System.out.println(user2.toString());


    }
}
