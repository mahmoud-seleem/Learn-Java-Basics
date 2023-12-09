package OOP;

public class Outer {
    int outerX ;

    public void outerXX(){
        System.out.println("iam an instance method in outer class");
        System.out.println(Stat.ss);
    }
    public  class Stat{
        static int ss;
    }
    public  class Inner1 {
        public  class Inner2{
            public Inner2(int x ){
                this.x = x;
            }
            int x ;
            public void p(){
//                System.out.println(outerX);
                System.out.println(this);
                System.out.println(Outer.this);
                System.out.println(Outer.Inner1.this);
            }
        }
    }
}
