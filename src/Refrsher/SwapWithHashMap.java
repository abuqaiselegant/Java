package Refrsher;

import java.util.HashMap;

public class SwapWithHashMap {
    public static void main(String[] args) {
        String inputString = "apple mango litchi";
        HashMap<String, Integer> wordCountMap = countWords(inputString);

        System.out.println("Input string: " + inputString);
        System.out.println("Word count:");
        for (String word : wordCountMap.keySet()) {
            int count = wordCountMap.get(word);
            System.out.println(word + ": " + count);
    }}

    public static HashMap<String, Integer> countWords(String input) {
        HashMap<String, Integer> wordCountMap = new HashMap<>();

        if (input == null || input.trim().isEmpty()) {
            return wordCountMap;
        }

        String[] words = input.split("\\s+");
        for (String word : words) {
            word = word.toLowerCase();
            if (wordCountMap.containsKey(word)) {
                int count = wordCountMap.get(word);
                wordCountMap.put(word, count + 1);
            } else {
                wordCountMap.put(word, 1);
            }
        }

        return wordCountMap;
    }


}
