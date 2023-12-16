import OOP.Account;
import OOP.Outer;
import OOP.generics.Box;
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
        Box box = new Box();
        Box<Integer> integerBox = new Box<>();
        box.setObject(10.0);
        integerBox.setObject(10);
        box = integerBox;
        box.setObject(10.5);
        System.out.println(integerBox.getObject());
//        The warning shows that raw
//        types bypass generic type
//        checks, deferring the catch
//        of unsafe code to runtime.
//        Therefore, you should avoid using raw types.
    }
    public static  <U extends Number> void  print(List<U> list){
        Number n = list.get(0);
        Number nn = 8.5;
        list.add((U) nn);
        for (U nnn : list){
            System.out.println(nnn.intValue());
        }
    }
    public static  void  print2(List<? super Number> list){
        Number n = helper(list);
        for (Object nnn : list){
            System.out.println(nnn);
        }
    }
    public static <T> Number helper(List<T> list){
        list.add(list.get(0));
        return (Number) list.get(0);
    }


    public static <E> void print1(List<E> list){
        for (E element : list){
            System.out.println(element.getClass().getName());
        }
    }

}
