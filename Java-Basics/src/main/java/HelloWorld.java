import OOP.inheritance.Empty;

public class HelloWorld  extends Empty{ 
    public HelloWorld(){
        System.out.println(55);
    }
    public static String name = "hello";
    {
        System.out.println("hi");
    }
    public int x = 10;
    public static void main(String[] args) {
        HelloWorld h = new HelloWorld();
        h.printx(h);
    }  
    public void printx(Empty e){
        System.out.println(e.x);

    }



}

