package geekbrainsjava.lesson10;


import java.util.ArrayList;
import java.util.HashMap;

public class Phonebook {

    HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();

    public void add(String lastName, String phoneNumber) {
        if (phoneBook.containsKey(lastName) && !phoneBook.get(lastName).contains(phoneNumber)) {
            phoneBook.get(lastName).add(phoneNumber);
        } else {
            ArrayList<String> phoneCollection = new ArrayList<>();
            phoneCollection.add(phoneNumber);
            phoneBook.put(lastName, phoneCollection);
        }
    }

    public String get(String lastName) {
        if (phoneBook.containsKey(lastName)) {

            StringBuilder phoneNumToString = new StringBuilder();
            phoneNumToString.append(lastName).append(": ");
            for (int i = 0; i < phoneBook.get(lastName).size(); i++) {
                phoneNumToString.append(phoneBook.get(lastName).toArray()[i]);
                if (i < phoneBook.get(lastName).size() - 1) {
                    phoneNumToString.append(", ");
                } else phoneNumToString.append(".");
            }
            return new String(phoneNumToString);
        } else {
            return lastName + ": номера телефонов не найдены";
        }
    }
}
