import OOP.Account;
import OOP.Outer;
import OOP.generics.Generic;
import OOP.inheritance.Human;
import OOP.inheritance.Person;
import OOP.polymorphism.Anonymous;

import java.util.Scanner;
public class HelloWorld {
    static {
        System.out.println("initialization of HelloWorld is here ");
    }
    public static void main(String[] args) {
        Generic<Integer> p = new Generic<>(5);
        Generic pp = new Generic();
        System.out.println(pp.gene);
//        p.actualName(0.5);
    }
    public static <T extends Comparable<T>> int countGreaterThan(T[] anArray, T elem) {
        int count = 0;
        for (T e : anArray)
            if (e.compareTo(elem) > 0)
                ++count;
        return count;
    }


}
