package repetition.functional;

@FunctionalInterface
public interface TextFormatter {
    String format(String text);

    default String description(){
        return "Форматирование текста";
    }
}
