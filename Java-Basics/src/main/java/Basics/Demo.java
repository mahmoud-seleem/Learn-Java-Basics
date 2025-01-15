package Basics;

import java.lang.invoke.StringConcatFactory;

public class Demo {
    public static void main(String[] args) {
        System.out.println("AB" == "A" + "B");
        String s = "B";
        System.out.println("AB" == "A" + s);
    }

    public static void print(int... x) {
        System.out.println(x.length);
        int[] xx[] = new int[10][5];
    }
}
