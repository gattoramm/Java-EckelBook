package p12.exceptions.exercises.ex1;

public class MainApp {
    public static void main(String[] args) {
       main("Hello!");
    }
    static void main(String str) {
        try {
            throw new Exception(str);
        } catch (Exception e) {
            System.out.println(str);
        } finally {
            System.out.println("Finally");
        }
    }
}
