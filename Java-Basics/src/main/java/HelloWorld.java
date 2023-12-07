import OOP.Account;
import OOP.inheritance.Human;
import OOP.inheritance.Person;

import java.util.Scanner;
public class HelloWorld {
    static {
        System.out.println("initialization of HelloWorld is here ");
    }
    public static void main(String[] args) {
        Human p = new Person();
        p.play();
    }
    public static void m(double y,double... x){
        System.out.println(x.length);
    }
    public static void m(double... x){
        System.out.println(x.length);
    }


}
