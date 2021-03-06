package main.java.ru.cti.phoneBook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, ArrayList<Contact>> phoneBook = new HashMap<>();
        ArrayList<Contact> contacts = new ArrayList<>();

        fillGroupsList(phoneBook, contacts, scanner);
        fillPhoneBook(phoneBook, contacts, scanner);
    }

    private static void fillPhoneBook(HashMap<String, ArrayList<Contact>> phoneBook, ArrayList<Contact> contacts, Scanner scanner) {
        while(true){
            System.out.println("Создать контакт (введите наименование и его номер или введите нет)?");
            String contactName = scanner.nextLine();
            if (contactName.equals("нет")){
                phoneBook.entrySet().forEach(entry -> {
                    for (Contact item : entry.getValue()) {
                        System.out.println("В группе " + entry.getKey() + " " +  item.getFirstName() + " " + item.getLastName());
                    }
                });
                break;
            }
            //Распарсим строку и создадим объект Contact
            String[] contactRawData = contactName.split(" ");
            Contact contact = new Contact(contactRawData[0], contactRawData[1], contactRawData[2]);

            System.out.println("Укажите группы контакта через пробел:");
            System.out.println("Доступные группы");
            for (String k : phoneBook.keySet()) {
                System.out.println(k);
            }
            String contactsGroup = scanner.nextLine();
            addContactsToGroups(phoneBook, contactsGroup, contact);
            }
        }

    private static void addContactsToGroups(HashMap<String, ArrayList<Contact>> phoneBook, String contactsGroup, Contact contact) {
        for (String word : contactsGroup.split(" ")) {
            if (phoneBook.containsKey(word)) {
                if (phoneBook.get(word).size() != 0) {
                    ArrayList existsContacts = phoneBook.get(word);
                    existsContacts.add(contact);
                    phoneBook.put(word, existsContacts);
                    continue;
                }
                ArrayList<Contact> newContacts = new ArrayList<>();
                newContacts.add(contact);
                phoneBook.put(word, newContacts);
            }
    }
}
    private static void fillGroupsList(HashMap<String, ArrayList<Contact>> phoneBook, ArrayList<Contact> contacts, Scanner scanner) {
        System.out.println("Введите название группы котактов" );
        while (true){
            if (phoneBook.size() != 0)
                System.out.println("Создать ещё одну группу (введите название группу или НЕТ):");
            String groupName = scanner.nextLine();
            if (groupName.equals("нет")){

                break;
            }
            phoneBook.put(groupName, contacts);
        }
    }
}
