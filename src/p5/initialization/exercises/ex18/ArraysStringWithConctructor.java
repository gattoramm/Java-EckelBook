package p5.initialization.exercises.ex18;


public class ArraysStringWithConctructor {
    public ArraysStringWithConctructor(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        String[] s1 = new String[] {};
        System.out.println("---------------------------");
        Object[] s2 = new Object[] { new ArraysStringWithConctructor("s1"), new ArraysStringWithConctructor("s2"), };
    }
}
