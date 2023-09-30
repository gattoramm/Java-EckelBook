package p21.threads.examples.thread.executor;

import p21.threads.examples.base.Liftoff;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class FixedThreadPool {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 2; i++)
            exec.execute(new Liftoff());
        exec.shutdown();
    }
}
