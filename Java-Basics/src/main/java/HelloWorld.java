import OOP.Account;
import OOP.inheritance.Human;
import OOP.inheritance.Person;

import java.util.Scanner;
public class HelloWorld {
    static {
        System.out.println("initialization of HelloWorld is here ");
    }
    public static void main(String[] args) {
        Account.StaticInnerClass staticInnerClass = new Account.StaticInnerClass();
        staticInnerClass.m();
    }


}
