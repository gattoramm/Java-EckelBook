package p21_threads.examples.concurrency;

public class MainThread {
    public static void main(String[] args) {
        Liftoff launch = new Liftoff();
        launch.run();
    }
}
