package geekbrainsjava.lesson10;

import java.util.*;

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

        Set<String> uniqueWordListForPrint = new HashSet<>(wordList);

        String[] wordArray = wordList.toArray(new String[0]);

        for (int i = 0; i < wordList.size(); i++) {

            int repeatedWordCounter;
            if (uniqueWordList.containsKey(wordArray[i])) {
                    repeatedWordCounter = uniqueWordList.get(wordArray[i]);
                    repeatedWordCounter++;
                    uniqueWordList.put((String) wordList.toArray()[i], repeatedWordCounter);
                } else {
                uniqueWordList.put((String) wordList.toArray()[i], 1);
            }
        }

        String[] uniqueWordArray = uniqueWordListForPrint.toArray(new String[0]);

        for (int i = 0; i < uniqueWordListForPrint.size(); i++) {
            System.out.println("Слово " + uniqueWordArray[i] + " встречается раз :" + uniqueWordList.get(uniqueWordArray[i]));
        }

        System.out.println();   //Homework part 2

        Phonebook phonebook = new Phonebook();
        phonebook.add("Ivanov", "84149872");
        phonebook.add("Ivanov", "84149872");
        phonebook.add("Ivanov", "3527812");
        phonebook.add("Sidorov", "435235212");
        System.out.println(phonebook.print("Ivanov"));
        System.out.println(phonebook.print("Sidorov"));
        System.out.println(phonebook.print("Petrov"));


    }
}
