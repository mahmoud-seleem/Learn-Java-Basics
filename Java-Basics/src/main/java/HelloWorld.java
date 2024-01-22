import java.util.Scanner;
import java.util.concurrent.Callable;

public class HelloWorld {


    public static void main(String[] args) {
        System.out.println(calculate((double val1,double val2) -> val1 + val2 ,15,20));
        
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



