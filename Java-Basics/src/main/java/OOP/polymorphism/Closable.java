package OOP.polymorphism;

public interface Closable {
    void close();
    int z  = 10;
    interface C{
        default void print(){
            System.out.println(z);
        }
    }
}
