package OOP.generics;

import OOP.inheritance.Human;
import OOP.polymorphism.Playable;

import java.util.List;

public class Generic<E> {
    public E gene ;

    public <S> Generic(S gene){
    }
    public Generic(){}
    public <N> void actualName(N gene){
        System.out.println(gene);
    }
    public static <C extends Number> void printList0(List<C> list){
        for(C element : list){
            System.out.println(element.getClass().getSimpleName() + (element.intValue() + 5));
        }
    }

    public  static void printList(List<? extends Number> list){
        for(Number element : list){
            System.out.println(element.getClass().getSimpleName() + (element.intValue() + 5));
        }
    }

    public static void p(List<?> list){

    }
}
