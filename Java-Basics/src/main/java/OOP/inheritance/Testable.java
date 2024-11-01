package OOP.inheritance;

public interface Testable {
    default void run(){
        System.out.println("test");
    };

     static void main(String[] args) {

    }

}
interface Testable2{
    default void run(){
        System.out.println("test2");
    }
}
class tst implements Testable2, Testable{

    @Override
    public void run() {
        System.out.println("child");
    }
}

