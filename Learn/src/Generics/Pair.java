package Generics;

import java.util.Objects;

public class Pair<K,V> {
    private  final K first;
    private  final V second;


    public Pair(K first, V second){
        this.first = first;
        this.second = second;
    }


    public K getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    @Override
    public String toString(){
        return "(" + first + ", " + second + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pair<?, ?> pair)) return false;
        return Objects.equals(getFirst(), pair.getFirst()) && Objects.equals(getSecond(), pair.getSecond());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirst(), getSecond());
    }
}
