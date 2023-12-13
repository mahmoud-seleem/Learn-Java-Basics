import OOP.Account;
import OOP.Outer;
import OOP.generics.Generic;
import OOP.inheritance.Human;
import OOP.inheritance.Person;
import OOP.polymorphism.Anonymous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class HelloWorld {
    static {
        System.out.println("initialization of HelloWorld is here ");
    }
    public static void main(String[] args) {
       print(Arrays.asList(1,2,3,4));
    }

//    public static <E> void print1(List<E> list){
//        for (E element : list){
//            System.out.println(element.getClass().getName());
//        }
//    }
    public static  List<?> print(List<?> list){
        for (Object element : list){
            System.out.println(element.getClass().getName());
        }
        return list;
    }


}
