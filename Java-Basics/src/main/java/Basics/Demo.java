package Basics;

import java.lang.invoke.StringConcatFactory;

public class Demo {
    public static void main(String[] args) {
        print(5,10);
    }
    public static void print(int ...x ){
        System.out.println(x.length);
    }
}
