package OOP;

public class Outer {
    int outerX ;
    public void outerXX(){
        System.out.println("iam an instance method in outer class");
    }
    public static class Inner extends Outer{
        int innerX;
        public void innerXX(){
            outerXX();
        }
    }
}
