package OOP;


public class Day extends Praent {

    public static void main(String[] args) {
       System.out.println(Day.x);
    }
    Day(){
        return;
    }

}
class Praent{
    static{
        System.out.println("initialization of the parent");
    }
    public static final int x = 10;
}
