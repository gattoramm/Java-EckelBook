package p12.exceptions.exercises.ex4;

class MyException extends Exception {
    public MyException(String str) {
        super(str);
    }
}

public class MainApp {
    public static void main(String[] args) {
        String str = "blah";
        try {
            throw new MyException(str);
        } catch (MyException e) {
            System.out.println(str);
        }
    }
}
