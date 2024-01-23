package OOP.lambda;

public class Child extends Parent{
    @Override
    public void print(){
        System.out.println("child");
    }

    public void l(){
        Foo foo = () -> {
          this.print();
          super.print();
        };
        foo.fooo();
    }
}
interface Foo{
    void fooo();
}
