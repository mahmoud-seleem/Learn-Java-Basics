package OOP.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class stream {
    public static void main(String[] args) {
        int[] values = {3, 10, 6, 1, 4, 8, 2, 5, 9, 7};
        String[] strings = {"Ahi","a","me"};
        // display original values
        System.out.print("Original values: ");
        List<String> s = Arrays.stream(strings)
                .filter(value -> value.compareTo("") > 0 )
                .sorted(String.CASE_INSENSITIVE_ORDER.reversed())
                .collect(Collectors.toList());
//        int sum = IntStream.
//                rangeClosed(1,10).sum();
        System.out.println(s);

    }
}
