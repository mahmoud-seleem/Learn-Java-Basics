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
        System.out.println((Integer) p.gene + 10);
        p.setGene(10);
        System.out.println((Integer) p.gene + 10);

    }


}
