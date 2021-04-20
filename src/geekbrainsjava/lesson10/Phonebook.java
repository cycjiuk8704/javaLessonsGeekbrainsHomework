package geekbrainsjava.lesson10;

import java.util.HashMap;

public class Phonebook {

    HashMap <String, String> phoneBook = new HashMap<>();

    public void add(String lastName, String phoneNumber) {
        if (phoneBook.containsKey(lastName)) {
            String phoneNumberBuf = phoneBook.get(lastName);
            phoneBook.put(lastName, phoneNumberBuf + ", " + phoneNumber);
        } else {
            phoneBook.put(lastName, phoneNumber);
        }
    }

    public String get(String lastName) {
        return phoneBook.getOrDefault(lastName, "В справочнике нет такого человека");
    }

}
