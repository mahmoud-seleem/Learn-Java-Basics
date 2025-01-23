package OOP;

public class Test {

    public static void main(String[] args) {
    Conc anon = new Conc(44){
        
        int x= 55;
        int z = 1000;
        @Override
        void im(){
            System.out.println("new version of im inside the annonymous class");
        }
    };
    System.out.println(anon.x);
    System.out.println(anon.y);
    System.out.println(anon.z);
    anon.im();
    }

    void m() {

    }

}

class Conc {
    int x = 3;
    static int y = 15;
    Conc(int x){
        super();
        this.x = x;
    }
    static void sm(){}
    void im(){}
}
