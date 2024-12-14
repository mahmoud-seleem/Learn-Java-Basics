import OOP.polymorphism.Closable;

public class HelloWorld implements Closable{
    public static String name = "hello";
    public static void main(String[] args) {
        int x = 0;
        switch(x){
            case 5:
            case 4:
            x = 5*x;
            break;
            default: 
           break;
            case 6:
            x = 6*x;
            break;
            case 36:
            break;
        }
    }  

    public void close(){

    }
}

