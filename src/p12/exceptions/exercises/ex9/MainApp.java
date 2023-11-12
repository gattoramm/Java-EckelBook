package p12.exceptions.exercises.ex9;

public class MainApp {
    static void runException() {
        MyException1.doStuff();
        MyException2.doStuff();
        MyException3.doStuff();
    }
    public static void main(String[] args) {
        try {
            runException();
        } catch (Exception e) {

        }
    }
}
