package OOP.polymorphism;

public interface Closable {
    void close();
    public static final int z  = (int)Math.random();

}
class xx implements Closable{
    public void close(){
        System.out.println(xx.z);
        System.out.println(z);
    }
}
