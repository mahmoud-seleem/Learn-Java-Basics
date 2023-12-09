package OOP.polymorphism;

public class Anonymous {
    int x;
    public Anonymous(int x ){
        this.x = x ;
        System.out.println(x);
    }
    public void m (){
        int z= 10;
        Anonymous a = new Anonymous(5){
            int x = z;
            public void mm(){
                System.out.println(x);
                System.out.println(Anonymous.this.x);
            }
        };
        System.out.println(a);
        System.out.println(a.x);
    }

}
