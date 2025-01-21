package OOP;


public class Day extends Praent {
    public int y = 10  ;
    public void m(){
        System.out.println(y);
        System.out.println(super.y);
    }
    public static void main(String[] args) {
        Day d = new Day();
        d.m();
    }


}
class Praent{
    public int y = 5;
    static{
        System.out.println("initialization of the parent");
    }
    public static final int x = 10;
}
