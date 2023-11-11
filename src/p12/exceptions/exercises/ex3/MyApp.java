package p12.exceptions.exercises.ex3;

public class MyApp {
    public static void main(String[] args) {
        try {
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {}
    }
}
