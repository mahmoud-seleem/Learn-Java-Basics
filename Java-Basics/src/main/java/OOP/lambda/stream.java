package OOP.lambda;

import java.util.Arrays;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class stream {
    public static void main(String[] args) {
        int[] values = {3, 10, 6, 1, 4, 8, 2, 5, 9, 7};
        // display original values
        System.out.print("Original values: ");
        IntStream
                .of(values)
                .forEach(value -> System.out.println(value));
        int sum = IntStream.
                range(1,10).reduce(0,(x, y) -> x+y);
        System.out.println(sum);
    }
}
