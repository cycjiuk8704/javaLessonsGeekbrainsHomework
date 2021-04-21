package geekbrainsjava.lesson10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

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

        Set<String> uniqueWordList = new HashSet<>(wordList);
        System.out.println(uniqueWordList);

        for (int i = 0; i < uniqueWordList.toArray().length; i++) {
            int repeatedWordCounter = 0;
            for (String s : wordList) {
                if (uniqueWordList.toArray()[i] == s) {
                    repeatedWordCounter++;
                }
            }
            System.out.println("Слово " + uniqueWordList.toArray()[i] + " встречается " + repeatedWordCounter + " раз");
        }

        System.out.println();   //Homework part 2

        Phonebook phonebook = new Phonebook();
        phonebook.add("Ivanov", "84149872");
        phonebook.add("Ivanov", "84149872");
        phonebook.add("Ivanov", "3527812");
        phonebook.add("Sidorov", "435235212");
        System.out.println(phonebook.get("Ivanov"));
        System.out.println(phonebook.get("Sidorov"));
        System.out.println(phonebook.get("Petrov"));


    }
}
