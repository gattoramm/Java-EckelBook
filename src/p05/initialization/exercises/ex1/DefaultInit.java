package p05.initialization.exercises.ex1;


public class DefaultInit {
    public static void main(String[] args) {
        String str = new String();
        if (str.isEmpty() )
            System.out.println("null");
        else
            System.out.println(str);
    }
}
