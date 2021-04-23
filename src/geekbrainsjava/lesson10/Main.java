package geekbrainsjava.lesson10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> wordList = new ArrayList<>();
        wordList.add("Table");
        wordList.add("Spoon");
        wordList.add("Fork");
        wordList.add("Will");
        wordList.add("Table");
        wordList.add("Candle");
        wordList.add("Prophet");
        wordList.add("Spoon");
        wordList.add("Candle");
        wordList.add("Fork");
        wordList.add("Spoon");
        wordList.add("Phone");
        wordList.add("Number");
        wordList.add("Candle");
        System.out.println(wordList);

        Map<String, Integer> uniqueWordList = new HashMap<>();

        for (String s : wordList) {

            if (uniqueWordList.containsKey(s)) {

                uniqueWordList.put(s, uniqueWordList.get(s) + 1);
            } else {
                uniqueWordList.put(s, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : uniqueWordList.entrySet()) {
            final String key = entry.getKey();
            final int value = entry.getValue();
            System.out.println("Слово " + key + " встречается раз :" + value);
        }

        System.out.println();   //Homework part 2

        Phonebook phonebook = new Phonebook();
        phonebook.add("Ivanov", "84149872");
        phonebook.add("Ivanov", "84149872");
        phonebook.add("Ivanov", "3527812");
        phonebook.add("Sidorov", "435235212");
        System.out.println(phonebook.formatToPrint("Ivanov"));
        System.out.println(phonebook.formatToPrint("Sidorov"));
        System.out.println(phonebook.formatToPrint("Petrov"));


    }
}
