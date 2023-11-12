package p12.exceptions.exercises.ex7;

public class MainApp {
    public static void main(String[] args) {
        try {
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace(System.out);
        }
    }
}
