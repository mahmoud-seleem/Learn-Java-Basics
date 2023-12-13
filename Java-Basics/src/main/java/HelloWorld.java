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
//       List<Integer> list0 = new ArrayList<>();
//       list0.add(10);
//       list0.add(5);
       List<Number> list1 = new ArrayList<>();
       list1.add(10);
       list1.add(5.0);
//       Generic.printList0(list0);
//        System.out.println("------------------------");
       Generic.printList0(list1);
        System.out.println("------------------------");
//       Generic.printList(list0);
//        System.out.println("------------------------");
       Generic.printList(list1);
       print(list1);
       print1(list1);
       List<? super Number> ll = list1;
       List<? super Integer > list = ll;
       Generic.p(list);
    }

    public static <E> void print1(List<E> list){
        for (E element : list){
            System.out.println(element.getClass().getName());
        }
    }
    public static  void  print(List<? extends Number> list){
        Number n = list.get(0);
        System.out.println(n);
    }


}
