package OOP.generics;

import OOP.inheritance.Human;
import OOP.polymorphism.Playable;

import java.util.List;

public class Generic<E> {
    public E gene ;
    public Generic(){

    }

    public Generic(E gene) {
        this.gene = gene;
    }

    public E getGene() {
        return gene;
    }

    public void setGene(E gene) {
        this.gene = gene;
    }
}
