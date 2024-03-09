package lesson8;

import java.util.*;
public class PhoneBook {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Jack ", "999-666-999");
        phoneBook.add("Dad", "666-777");
        phoneBook.add("Mam", "222-6666-9999");
        phoneBook.add("Mam", "996-699");

        System.out.println("Phonebook");
        System.out.println("Mam number: " + phoneBook.get("mam"));
        System.out.println("Dad number: " + phoneBook.get("dad"));
    }

    private final Map<String, List<String>> phoneBook = new HashMap<>();

    public void add(String lastName, String phoneNumber) {
        List<String> phones = phoneBook.getOrDefault(lastName, new ArrayList<>());
        phones.add(phoneNumber);
        phoneBook.put(lastName, phones);
    }

    public List<String> get(String lastName) {
        return phoneBook.getOrDefault(lastName, new ArrayList<>());
    }
}

