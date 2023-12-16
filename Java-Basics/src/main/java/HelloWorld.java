import OOP.generics.Box;

import java.util.ArrayList;
import java.util.List;

public class HelloWorld {
    static {
        System.out.println("initialization of HelloWorld is here ");
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(555);
        print1(list);
//        box = integerBox;
//        box.setObject(10.5);
//
//        System.out.println(integerBox.getObject());
//        The warning shows that raw
//        types bypass generic type
//        checks, deferring the catch
//        of unsafe code to runtime.
//        Therefore, you should avoid using raw types.
    }

    public static void print(List<? extends Number> list){
        list.add(10);
        for (Number n : list){
            System.out.println(n);
        }
    }
    public static <T extends  Number >void print1(List<T> list){
        list.add((T) Double.valueOf(5.5));
        // bad behavior as we added
        // double value to int list
        for (Number n : list){
            System.out.println(n);
        }
    }


}
