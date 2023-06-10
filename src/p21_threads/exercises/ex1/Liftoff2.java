package p21_threads.exercises.ex1;

public class Liftoff2 implements Runnable{
    protected int countDown = 3;
    private static int taskCount = 0;
    private final int id = taskCount++;

    public Liftoff2() {
        System.out.println("Hello from constructor for object");
    }

    @Override
    public void run() {
        while (countDown-- > 0) {
            System.out.println("# Thread_" + id + " - " + countDown + " Hello from Liftoff2!");
            Thread.yield();
        }
        System.out.println("Goodbye from Liftoff2!");
    }
}
