package JVM;

public class Test {
    public static void main(String[] args) {
        MyClass[] s = new MyClass[10];
        MyClassParent[] a;
        a = s;
        a[0] = new AnotherChild("");
    }
}


