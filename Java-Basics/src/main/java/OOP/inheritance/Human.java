package OOP.inheritance;

import OOP.polymorphism.Playable;

public class Human implements Playable {

    static {
        System.out.println("init of Human");
    }
    private String name ;
    public static int stat;
    public static void m(){
        System.out.println("hello");
    }
    public int x = 10;
    public Human(){
        System.out.println(getName());
        this.name = "mahmoud";
    }

    public final String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    private void pri(){

    }
     @Override
     public void play(){

    }
}
