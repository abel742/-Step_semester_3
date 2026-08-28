package week2.assigment_problems;

public class WordReverse {

    public static String reverseEachWord(String sentence) {

        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {

            StringBuilder reversed = new StringBuilder(word);
            reversed.reverse();

            result.append(reversed).append(" ");
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {

        String sentence = "hello club";

        System.out.println(reverseEachWord(sentence));
    }
}