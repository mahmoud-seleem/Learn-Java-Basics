package OOP.generics;

import OOP.inheritance.Human;
import OOP.polymorphism.Playable;

public class Generic<E extends Number> {
    public E gene ;

    public Generic(E gene){
        this.gene = gene;
    }
    public Generic(){}
    public <N extends Number> void actualName(N gene){
        System.out.println(gene.doubleValue());
    }
}
