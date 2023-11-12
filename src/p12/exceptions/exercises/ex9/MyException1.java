package p12.exceptions.exercises.ex9;

public class MyException1 extends ArrayIndexOutOfBoundsException{
    static void doStuff() {
        throw new ArrayIndexOutOfBoundsException();
    }
}
