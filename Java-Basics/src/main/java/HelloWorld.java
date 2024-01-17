import OOP.generics.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HelloWorld {
    static {
        System.out.println("initialization of HelloWorld is here ");
    }
    public static void main(String[] args) {
        Box<Integer> box = new Box<>();
        box.setElement(5);
        int x = box.getElement();
        Box b = box;
        box = b;

    }
    
    public <C> void s(C[] cs){
        System.out.println(cs.length);
    }
}


