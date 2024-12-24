package OOP.generics;

import java.util.ArrayList;
import java.util.List;

public class Main<T> {
    private T object;

    public void setObject(T object) {
        this.object = object;
    }

    public T getObject() {
        return this.object;
    }

    public void print(T item) {
        System.out.println(item);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list.add(10);
        List list2 = list;
        list2.add("args");
        for(Integer o : list){
            System.out.println(o);
        }
    }
    public static <E> void printList(List<E> list){
        for (E item : list){
            System.out.println(item);
        }
    }
}

interface C<C> {
    void print(C item);
}
