package OOP.polymorphism;

public interface Closable {
    void close();
    public static final int CONSTANT  = (int)Math.random();
    public static void printing(){
        System.out.println("printing");
    }
    default void pp(){
        System.out.println(this);
        ppp();
    }
    private void ppp(){
        System.out.println(this);
        System.out.println("private non static in interface ");
    }

    
}
class xx extends Hi implements Closable  {
    public void close(){
        System.out.println(CONSTANT);
        Closable.printing();
    }
    
    public static void main(String[] args) {
        Closable x  = new xx();
        x.pp();
    }

    
    public void ppp(){}
}
class Hi{
    public void pp(){
        System.out.println("HI");
    }
}
