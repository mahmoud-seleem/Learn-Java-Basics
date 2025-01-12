package Basics;

import java.lang.invoke.StringConcatFactory;
public class Demo {
    public static void main(String[] args) {
        short x = print((short)5000000);
    }
    public static short print(short x ){
        System.out.println(x);
        return x;
    }
    public static char print(char x ){
        System.out.println(x);
        return x;
    }
}
