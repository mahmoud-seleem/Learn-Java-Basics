package OOP.inheritance;

import OOP.polymorphism.Playable;

public class Human  {
    private int xxxx = 10;
    private Person p;
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
        System.out.println();
    }

}
