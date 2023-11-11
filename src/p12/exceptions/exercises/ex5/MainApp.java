package p12.exceptions.exercises.ex5;

public class MainApp {
    static int doStuff(double d ) {
        if (d > 0.9) return 0;
        try {
             throw new Exception();
        } catch (Exception e) {
            System.out.println("Missing");
            return 42;
        }

    }
    public static void main(String[] args) {
        while (doStuff(Math.random()) != 0) {}
    }
}
