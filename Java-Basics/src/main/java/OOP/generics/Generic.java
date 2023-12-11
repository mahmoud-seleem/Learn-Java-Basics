package OOP.generics;

import OOP.inheritance.Human;
import OOP.polymorphism.Playable;

public class Generic<E extends Number> {
    public E gene ;

    public <S> Generic(S gene){
    }
    public Generic(){}
    public <N> void actualName(N gene){
        System.out.println(gene);
    }
}
