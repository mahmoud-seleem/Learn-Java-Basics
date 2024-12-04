package JVM;
import org.aspectj.apache.bcel.classfile.*;
import java.io.EOFException;

public class Test extends MyClass{
    public static void main(String[] args){
        Test t = new Test();
        t.printing();
    }
    public void printing(){
        super.parentPrint();
    }
    
}


