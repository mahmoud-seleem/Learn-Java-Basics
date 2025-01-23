package OOP;


public class Day extends Praent implements Playable{
    public int y = 10  ;
    public void m(){
        System.out.println(y);
        System.out.println(super.y);
    
            
    }
    private  void pr(){
        System.out.println("aaaaaafsf");
    }
    public static void main(String[] args) {
        PlayableParent2 d = new Day();
        ///d.m();
        d.printing();
    }


}
class Praent{
    public int y = 5;
    static{
        System.out.println("initialization of the parent");
    }
    public static final int xx = 10;
    public static void mm(){}
    
}
interface Playable extends PlayableParent2{
    default int print(int x){
        return 5;
    };
}
// interface PlayableParent{
//     default int print(int x){
//         return 0;
//     }
// }
interface PlayableParent2{
    public static int c = 10 ;
    int print(int x);
    public static void st(){}
    public default void printing(){
        pr();
    } 
    private  void pr(){
        System.out.println("afsf");
    }
}

