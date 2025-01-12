package Basics;

import java.lang.invoke.StringConcatFactory;
public class Demo {
    public static void main(String[] args) {
        short x = print((short)5000001);
    }
    public static short print(short x ){
        System.out.println(x);
        return x;
    }
}
