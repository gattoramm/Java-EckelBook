package p12.exceptions.exercises.ex9;

public class MyException2 extends StringIndexOutOfBoundsException{
    static void doStuff() {
        throw new StringIndexOutOfBoundsException();
    }
}
