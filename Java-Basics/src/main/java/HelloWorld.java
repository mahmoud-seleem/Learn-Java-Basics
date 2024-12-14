import OOP.polymorphism.Closable;

public class HelloWorld implements Closable{
    public static String name = "hello";
    public static void main(String[] args) {
        int x = 0;
        outer:
        while (true) {
            inner:
            System.out.println("outer");
            while (true) {
                if (x == 1){
                    break ;
                }                     
            }
        }
    }  

    public void close(){

    }
}

