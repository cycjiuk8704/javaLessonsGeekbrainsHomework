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

    public void get(String lastName) {
        if (phoneBook.containsKey(lastName)) {
//            String[] phoneNumToPrint = (String[]) phoneBook.get(lastName).toArray();
            StringBuilder phoneNumToString = new StringBuilder();
            phoneNumToString.append(lastName).append(": ");
            for (int i = 0; i < phoneBook.get(lastName).toArray().length; i++) {
                phoneNumToString.append(phoneBook.get(lastName).toArray()[i]);
                if (i < phoneBook.get(lastName).toArray().length - 1) {
                    phoneNumToString.append(", ");
                } else phoneNumToString.append(".");
            }

            System.out.println(phoneNumToString);
        } else {
            System.out.println(lastName + ": номера телефонов не найдены");
        }


//        if (phoneBook.containsKey(lastName)) {
//            return phoneBook.get(lastName);
//        } else {
//            return new ArrayList<>();
//        }

    }
//    public void printResult(String lastName) {
//        String[] phoneNumToPrint = (String[]) phoneBook.get(lastName).toArray();
//        StringBuilder phoneNumToString = new StringBuilder();
//        phoneNumToString.append(lastName).append(": ");
//        for (int i = 0; i< phoneNumToPrint.length; i++){
//            phoneNumToString.append(phoneNumToPrint[i] + ", ");
//        }
//        phoneNumToString.append(".");
//        System.out.println(phoneNumToString);
//    }

}
