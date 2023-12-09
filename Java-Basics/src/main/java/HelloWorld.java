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
        Outer out = new Outer();
        Outer.Inner1 in1 = out.new Inner1();
        Outer.Inner1.Inner2 in2 = in1.new Inner2(5);
        in2.p();
    }


}
