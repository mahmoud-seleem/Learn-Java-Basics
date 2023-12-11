package OOP.generics;

import OOP.inheritance.Human;
import OOP.polymorphism.Playable;

public class Generic<E> {
    public E gene ;

    public Generic(E gene){
        this.gene = gene;
    }
    public void setGene(E gene){
        this.gene = gene;
    }
}
