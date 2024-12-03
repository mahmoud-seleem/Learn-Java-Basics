package JVM;
import org.aspectj.apache.bcel.classfile.*;
import java.io.EOFException;

public class Test {
    public static void main(String[] args){
        try{
            JavaClass javaClass = new ClassParser("Java-Basics\\target\\classes\\JVM\\MyClass.class").parse();
            ConstantPool constantPool = javaClass.getConstantPool();
            Constant[] aConstants = constantPool.getConstantPool();
            for (int i = 1 ; i <= aConstants.length ;i++){
                System.out.println("----------");
                System.out.println(aConstants[i].getClass().getName());
            }
        }catch(Exception e){
            System.out.println(e);
        }


    }
}


