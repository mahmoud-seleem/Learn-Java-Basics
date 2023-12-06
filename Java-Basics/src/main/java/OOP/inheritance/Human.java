package OOP.inheritance;

public class Human {

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
        this.name = "no-name";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
