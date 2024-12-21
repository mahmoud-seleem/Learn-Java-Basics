package OOP.generics;

import java.util.LinkedList;
import java.util.List;

public class Main<E extends Shape> {

    public E[] elements;
    public Main(){
        elements =(E[]) new Shape[10];
    }
    public static void main(String[] args) {
    //  Main<String> ms = new Main<>();
    //  ms.elements[0] = "10";
    }
}
