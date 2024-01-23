import OOP.lambda.Child;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.function.Predicate;

public class HelloWorld {

    public static void main(String[] args) {
        Printable p = new Printable() {
            @Override
            public void print(String s) {
                System.out.println("override"+ s);

            }
        };
        p.print("");

    }
    static double calculate(BinaryCalculator calc, double v1, double v2)
    {
        return calc.calculate(v1, v2);
    }
    static double calculate(UnaryCalculator calc, double v)
    {
        return calc.calculate(v);
    }
}
interface BinaryCalculator{
    double calculate(double val1,double val2);
}
interface UnaryCalculator
{
    double calculate(double value);
}
interface Printable{
    default void  print(String s){
        System.out.println("default");
    };
}



