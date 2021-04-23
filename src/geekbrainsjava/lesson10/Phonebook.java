package geekbrainsjava.lesson10;


import java.util.*;

public class Phonebook {

    Map<String, Set<String>> phoneBook = new HashMap<>();

    public boolean add(String lastName, String phoneNumber) {
        if (!phoneBook.containsKey(lastName)) {
            phoneBook.put(lastName, new LinkedHashSet<>());
        }
        return phoneBook.get(lastName).add(phoneNumber);
    }

    public Set<String> get(String lastName) {
        return phoneBook.getOrDefault(lastName, Collections.emptySet());
    }

    public String formatToPrint(String lastName) {
        Set<String> phoneBookNote = get(lastName);
        if (phoneBookNote.isEmpty()) {
            return lastName + ": номера телефонов не найдены";
        }

        Iterator<String> iter = phoneBook.get(lastName).iterator();

        StringBuilder phoneNumToString = new StringBuilder();
        phoneNumToString.append(lastName).append(": ");
        while (iter.hasNext()) {
            phoneNumToString.append(iter.next());

            if (iter.hasNext()) {
                phoneNumToString.append(", ");
            }
        }
        phoneNumToString.append(".");

        return new String(phoneNumToString);
    }
}
