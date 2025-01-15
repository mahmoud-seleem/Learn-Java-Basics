package Basics;

import java.lang.invoke.StringConcatFactory;

public class Demo {
    public static void main(String[] args) {
        Object myObject = null;
        // get object from somewhere

        if (myObject instanceof String str) {
            System.out.println(str.substring(0, 5));
        }
        // str = "dfs";
        // istead of
        if (myObject instanceof String) {
            String str = (String) myObject;
            System.out.println(str.substring(0, 5));
        }

    }

}
