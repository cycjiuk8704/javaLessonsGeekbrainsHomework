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

    public ArrayList<String> get(String lastName) {
        return phoneBook.getOrDefault(lastName, null);

    }
}
