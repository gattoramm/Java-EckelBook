package p05.initialization.exercises.ex19;


public class StringVarargs {
    static void f(String... args) {
        for (String str: args) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        f("f", "ff");
        String[] ss = new String[]{"dd", "d"};
        f(ss);
    }
}
