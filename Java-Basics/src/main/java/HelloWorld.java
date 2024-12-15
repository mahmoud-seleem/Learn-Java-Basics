import OOP.inheritance.Empty;
import OOP.inheritance.Human;
import OOP.inheritance.Person;

public class  HelloWorld  extends Empty{ 
    public HelloWorld(){
        System.out.println(55);
    }
    public static String name = "hello";
    {
        System.out.println("hi");
    }
    public int x = 10;
    public static void main(String[] args) {
        Empty h = new Empty();
        HelloWorld hh = (HelloWorld)h;
    }  
    public void printx(Empty e){
        System.out.println(e.x);

    }

    @Override
    protected OOP.inheritance.Person m(){
        return new Person();
    }


}

