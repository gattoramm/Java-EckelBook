package p21_threads.exercises.ex6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class RandomSleep implements Runnable {
    private int sleepTime;

    public RandomSleep(int sleepTime) {
        this.sleepTime = sleepTime;
    }

    @Override
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(sleepTime);
            System.out.println("I'm sleep " + sleepTime + " seconds");
        } catch (InterruptedException e) {
            System.err.println(e);
        }

    }
}
public class MainApp {
    public static void main(String[] args) {
        int count = 17;//Integer.parseInt(args[0]);

        ExecutorService exec = Executors.newFixedThreadPool(count);

        for (int i = 0; i < count; i++) {
            int sleepTime = (int) (Math.random() * 20) + 1;
            exec.execute(new RandomSleep(sleepTime));
        }
        exec.shutdown();
    }
}
