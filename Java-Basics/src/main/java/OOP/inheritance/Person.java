package OOP.inheritance;

import OOP.polymorphism.Closable;
import OOP.polymorphism.Playable;

import java.io.Closeable;
import java.io.IOException;

public class Person extends Human implements Closeable {
    private int xxxx = 1000;
    public Person(){

    }
    public int x = 5;
    static {
        System.out.println("init of person");
    }
    public static void m(){
        System.out.println("hello");
    }
    @Override
    public final void close()  {

    }
    @Override
    public  void play(){
        System.out.println("play");
    }
}

