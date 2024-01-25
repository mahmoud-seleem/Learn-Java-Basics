package concurrency;

import java.awt.*;
import java.security.SecureRandom;

public class Printer implements Runnable {
    private static final SecureRandom GENERATOR = new SecureRandom();
    private final String TASK_NAME;
    private final int SLEEP_TIME;
    public Printer(String taskName){
        this.TASK_NAME = taskName;
        SLEEP_TIME = GENERATOR.nextInt(5000);
    }

    @Override
    public void run() {
        System.out.println(TASK_NAME + " will sleep for "+ SLEEP_TIME);
        try {
            Thread.sleep(SLEEP_TIME);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println(TASK_NAME + " is Done sleeping");
    }
}
