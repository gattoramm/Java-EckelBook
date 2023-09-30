package p21.threads.examples.thread;


import p21.threads.examples.base.Liftoff;

public class BasicThreads {
    public static void main(String[] args) {
        Thread t = new Thread(new Liftoff());
        t.start();
        System.out.println("Waiting for Liftoff");
    }
}
