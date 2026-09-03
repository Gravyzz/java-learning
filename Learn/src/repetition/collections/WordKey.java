package repetition.collections;

final class WordKey {
    private final String text;

    WordKey(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object other) {
       if (other == this) return true;
       if (!(other instanceof WordKey)) return false;
        WordKey key = (WordKey) other;
       return text.equals(key.text);
    }

    @Override
    public int hashCode() {
       return text.hashCode();
    }

}