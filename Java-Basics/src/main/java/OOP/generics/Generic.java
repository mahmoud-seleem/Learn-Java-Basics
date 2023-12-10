package OOP.generics;

import OOP.inheritance.Human;
import OOP.polymorphism.Playable;

public class Generic<E> {
    E gene ;

    public Generic(E s){
        gene = s;
    }
}
