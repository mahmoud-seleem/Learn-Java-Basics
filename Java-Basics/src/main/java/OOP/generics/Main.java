package OOP.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        List<Integer> list2 = new ArrayList<>();
        list.add("100");
        List<?> list1 = list;
        printList(list1);
        list2.add(15);
        printList2(list2);
    }

    public static void printList2(List<? extends Number > l){
        for(Object o : l){
            System.out.println(o);
        }
        Number n = l.get(0).doubleValue();
        System.out.println(n);
    }
    public static <T> void printList(List<T> l) {
        for (T t : l) {
            System.out.println(t);
        }
        T tt = l.get(0);
        System.out.println(tt);
    }
    public static <E> void g(E... a){
        for (E e : a){
            System.out.println(e);
        }
    }
}