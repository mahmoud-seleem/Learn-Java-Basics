import OOP.generics.Animal;
import OOP.generics.Box;
import OOP.generics.Cat;
import OOP.generics.Dog;

import java.util.ArrayList;
import java.util.List;

public class HelloWorld {
    static {
        System.out.println("initialization of HelloWorld is here ");
    }
    public static void main(String[] args) {
        List<? extends Integer> integers = new ArrayList<>();
        List<? extends Number> numbers = new ArrayList<>();
        List<?> objects  = new ArrayList<>();
        List<Integer> integers1 = new ArrayList<>();
        List<? super Number> numberSupers = new ArrayList<>();
        List<? super Integer> supers = new ArrayList<>();
//        objects = numbers;
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
      //list.add(10);
//        for (Number n : list){
//            System.out.println(n);
        //}

    }
    public static <T extends  Number >void print1(List<T> list){
//        list.add((T)Double.valueOf(5.5));
//        // bad behavior as we added
//        // double value to int list
//        for (Number n : list){
//            System.out.println(n);


        }
        public static void printArray(Animal[] animals){
            animals[0] = new Cat();
            for (Animal a : animals){
                System.out.println(a.getClass().getSimpleName());
            }
        }
    }

