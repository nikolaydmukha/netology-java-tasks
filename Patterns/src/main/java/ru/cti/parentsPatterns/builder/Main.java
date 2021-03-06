package main.java.ru.cti.parentsPatterns.builder;



public class Main {
    public static void main(String[] args) {
        Person nikolayDmukha = new PersonBuilder().setName("Nikolay").setSurname("Dmukha").build();
        Person juliaDmukha = new PersonBuilder().setName("Julia").setSurname("Dmukha").setAge(31).setAddress("Moscow").build();

        try {
            Person vladimirDmukha = new PersonBuilder().setName("Vladimir").setSurname("Dmukha").setAge(-100).build();
        }
        catch (IllegalStateException ex) {
            System.out.println("Возраст не можети быть отрицательным. Объект не создан.");
        }
        System.out.println(nikolayDmukha.toString());
        System.out.println(juliaDmukha.toString());
    }
}
