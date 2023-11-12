package p12.exceptions.exercises.ex6;

class MyException1 extends Exception {
    @Override
    public String getMessage() {
        return "MyException1";
    }
}

class MyException2 extends Exception {
    @Override
    public String getMessage() {
        return "MyException2";
    }
}

public class MainApp {
    public static void main(String[] args) {
        try {
            throw new MyException1();
        } catch (MyException1 e) {
            e.printStackTrace(System.out);
        }
        try {
            throw new MyException2();
        } catch (MyException2 e) {
            e.printStackTrace(System.out);
        }
    }
}
