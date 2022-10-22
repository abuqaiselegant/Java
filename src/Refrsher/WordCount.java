package Refrsher;

public class WordCount {
    public static void main(String[] args) {
        String inputString = "Thsdf";
        int wordCount = countWords(inputString);

        System.out.println("Input string: " + inputString);
        System.out.println("Number of words: " + wordCount);
    }


    public static int countWords(String input) {
        if (input == null || input.trim().isEmpty()) {
            return 0;
        }

        String[] words = input.split("\\s+"); // Split the string by one or more whitespace characters
        return words.length;
}}
