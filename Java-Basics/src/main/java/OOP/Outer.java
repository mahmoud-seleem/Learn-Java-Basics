package OOP;

public class Outer {
    int outerX ;

    public void outerXX(){
        System.out.println("iam an instance method in outer class");
        System.out.println();
    }
    public  class Inner1 {
        public  class Inner2{

            int x ;
            public void p(){
                System.out.println(this);
                System.out.println(Outer.this);
                System.out.println(Outer.Inner1.this);
            }
        }
    }
}
