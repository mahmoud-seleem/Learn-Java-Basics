package OOP.polymorphism;

public interface Closable {
    void close();
    int z  = 10;

}
class xx implements Closable{
    public void close(){
        System.out.println(z);
    }
}
