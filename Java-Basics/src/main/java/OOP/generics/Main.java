package OOP.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main<T extends Exception> {
    private T object;

    public void setObject(T object) {
        this.object = object;
    }

    public T getObject() {
        try {
            print(object);   
        } catch (Exception e) {
            // TODO: handle exception
        }
        return this.object;
    }

    public void print(T item) throws T {
        System.out.println(item);
    }

    public static void main(String[] args) {
        genricPrintList(new ArrayList<String>());
    }

    public static void printList(List<?> list) {
        for (Object item : list) {
            System.out.println(item);
        }
        // list.add(list.get(0));
        

    }

    public static <E> void genricPrintList(List<E> list) {
        for (E item : list) {
            System.out.println(item);
        }
    } 
    public static <E extends Number> void swap(List<E> list, E item){
        list.set(0, item);
    }
}

interface C<C> {
    void print(C item);
}
