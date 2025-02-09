package concurrency;

import java.util.Arrays;

public class MainThread {
    public static void main(String[] args) {
        double[] a = new double[100000000];
        double[] aa = new double[100000000];
        double[] aaa = new double[100000000];
        Arrays.fill(a, 0.0);
        Arrays.fill(aa, 0.0);
        Arrays.fill(aa, 0.0);
        Thread t1 = new Thread(() -> Arrays.sort(a));
        Thread t2 = new Thread(() -> Arrays.sort(aa));
        Thread t3 = new Thread(() -> Arrays.sort(aaa));
        double l1 = System.nanoTime();
        // Arrays.sort(a);
        // Arrays.sort(aa);
        // Arrays.sort(aaa);
        t1.start();
        t2.start();
        t3.start();
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (Exception e) {
            // TODO: handle exception
        }
        double l2 = System.nanoTime();
        System.out.println((l2 - l1) / 1000.0 / 1000.0 / 1000.0);
    }

}
