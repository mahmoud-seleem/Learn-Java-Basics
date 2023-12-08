import OOP.Account;
import OOP.Outer;
import OOP.inheritance.Human;
import OOP.inheritance.Person;

import java.util.Scanner;
public class HelloWorld {
    static {
        System.out.println("initialization of HelloWorld is here ");
    }
    public static void main(String[] args) {
        Outer inner  = new Outer.Inner();
    }


}
