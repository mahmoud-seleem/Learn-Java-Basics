import OOP.inheritance.Empty;

public class HelloWorld extends Empty { 
    public int x;
    public static String name = "hello";
    public static void main(String[] args) {
        HelloWorld h = new HelloWorld();
        h.x = 5;
        System.out.println(h.x);
    }  
    public void printx(){
        System.out.println(this.x);
        System.out.println(super.x);
    }

    @Override
    public void m(){
        
    }

}

