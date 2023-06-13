package p21_threads.examples.ex2_threadPools;

import p21_threads.examples.ex1_base.Liftoff;

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
