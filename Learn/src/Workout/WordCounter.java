package Workout;

import java.util.*;


public class WordCounter {

    public static Map<String, Integer> countWords(String text){
        Map<String, Integer> counts = new HashMap<>();
        String[] words = text.toLowerCase().split(" ");
        for (String word : words) {
            if (word.isEmpty()) continue;
            counts.put(word, counts.getOrDefault(word,0)+1);
        }
        return counts;
    }
}
