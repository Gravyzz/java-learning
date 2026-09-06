package repetition.functional;

import java.util.List;
import java.util.Optional;



public class Main {
    public static void main(String[] args) {

        System.out.println(
                findFirstLongWord(List.of("go", "java", "spring"))
                        .orElse("not found")
        );
        System.out.println(findFirstLongWord(List.of("a", "sql")).orElse("not found"));
        System.out.println(findFirstLongWord(List.of()).orElse("not found"));

    }

    static Optional<String> findFirstLongWord(List<String> words){
        return words.stream()
                .filter(word -> word.length()>=4)
                .findFirst();

        }



}
