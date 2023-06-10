package p21_threads.exercises.ex1;

public class MoreBasicThread {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Thread t = new Thread(new Liftoff2());
            t.start();
            System.out.println("Waiting for Liftoff2");
        }
    }
}
