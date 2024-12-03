package JVM;

public class MyClass extends MyClassParent {
    public MyClass(){
        this("name");
    }
    public MyClass(String name){
        super(name);
    }
    static final int x = 10;
    public void parentPrint(){}
    
}
