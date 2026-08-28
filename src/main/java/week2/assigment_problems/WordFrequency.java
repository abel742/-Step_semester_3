package week2.assigment_problems;

import java.util.*;

public class WordFrequency {

    public static void printFilteredWordFrequency(String feedback) {

        String[] stopWords = {
                "the", "was", "and", "a", "is", "of", "in"
        };

        feedback = feedback.toLowerCase();

        feedback = feedback.replaceAll("[.,!?]", "");

        String[] words = feedback.split("\\s+");

        HashMap<String, Integer> frequency = new HashMap<>();

        for (String word : words) {

            boolean isStopWord = false;

            for (String stopWord : stopWords) {
                if (word.equals(stopWord)) {
                    isStopWord = true;
                    break;
                }
            }

            if (!isStopWord) {

                frequency.put(
                        word,
                        frequency.getOrDefault(word, 0) + 1
                );
            }
        }

        List<Map.Entry<String, Integer>> list =
                new ArrayList<>(frequency.entrySet());

        list.sort((a, b) ->
                b.getValue().compareTo(a.getValue())
        );

        for (Map.Entry<String, Integer> entry : list) {

            System.out.println(
                    entry.getKey() + ": " + entry.getValue()
            );
        }
    }

    public static void main(String[] args) {

        String feedback =
                "The mentor was great and clear.";

        printFilteredWordFrequency(feedback);
    }
}