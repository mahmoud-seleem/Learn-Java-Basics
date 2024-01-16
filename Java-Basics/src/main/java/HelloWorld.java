import OOP.generics.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HelloWorld {
    static {
        System.out.println("initialization of HelloWorld is here ");
    }
    public static void main(String[] args) {
    }

    public static <T> void capture(List<T> list){
        list.add(list.get(0));
    }
    public static <E extends Comparable<?>> void sort(List<E> list){

    }
}


