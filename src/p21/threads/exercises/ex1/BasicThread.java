package p21.threads.exercises.ex1;

public class BasicThread {
    public static void main(String[] args) {
        Thread thread = new Thread(new Liftoff2());
        thread.start();
    }
}
