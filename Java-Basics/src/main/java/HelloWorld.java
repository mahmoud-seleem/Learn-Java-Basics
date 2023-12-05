import OOP.Account;

import java.util.Scanner;
public class HelloWorld {
    static {
        System.out.println("initialization of HelloWorld is here ");
    }
    public static void main(String[] args) {
        Account a = new Account();
        a.sss();
    }
    public static void m(double y,double... x){
        System.out.println(x.length);
    }
    public static void m(double... x){
        System.out.println(x.length);
    }


}
