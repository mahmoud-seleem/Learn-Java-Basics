import OOP.generics.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HelloWorld {
    static {
        System.out.println("initialization of HelloWorld is here ");
    }
    public static void main(String[] args) {
//        List<Animal> creatures = new ArrayList<>();
//        creatures.add(new Animal());
//        creatures.get(0).age = 10;
//        creatures.add(new Animal());
//        creatures.get(1).age = 5;
//        sort(creatures);
    }
    public static <T> void capture(List<T> list){
        list.add(list.get(0));
    }
    public static <E extends Comparable<?>> void sort(List<E> list){

    }
}


