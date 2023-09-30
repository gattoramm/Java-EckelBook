package p02.objects.exercises.ex6;


public class Storage {

    public static int storage(String s) {
        return s.length() * 2;
    }

    public static void main(String[] args) {
        System.out.println(storage("я"));
    }
}
