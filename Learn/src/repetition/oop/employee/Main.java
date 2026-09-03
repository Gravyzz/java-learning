package repetition.oop.employee;

import java.util.*;

public class Main {
        public static void main(String[] args){
            Map<String, Integer> check =
                    countWords(List.of("java", new String("java"), "Java"));

            System.out.println(check.get("java"));
            System.out.println(check.get("Java"));
            System.out.println(check.size());
            System.out.println(countWords(List.of()).size());


        }

    static Map<String, Integer> countWords(List<String> words){
            Map<String, Integer> wordsMap = new HashMap<>();

            for (int i = 0; i < words.size(); i++) {
                String word = words.get(i);
                if (wordsMap.containsKey(word)){
                    wordsMap.put(word,wordsMap.get(word)+1);
                } else wordsMap.put(word, 1);
        }
            return wordsMap;
    }

}
