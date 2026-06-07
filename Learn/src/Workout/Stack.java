package Workout;

import java.util.*;

public class Stack <T> {

    private final List<T> list = new ArrayList<>();

    public void push(T item){
         list.add(item);
    }

    public T pop(){
        if (list.isEmpty()) throw new EmptyStackException("Список пуст!");
        return list.remove(list.size() - 1);
    }

    public T peek(){
        if (list.isEmpty()) throw new EmptyStackException("Список пуст!");
        return list.get(list.size() - 1);
    }

    public int size(){
        return list.size();
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

}
