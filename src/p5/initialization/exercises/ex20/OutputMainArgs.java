package p5.initialization.exercises.ex20;


public class OutputMainArgs {
    public static void main(String[] args) {
        MainArgs.main("one", "two", "four");
        System.out.println();
        MainArgs.main("1", "2", "3", "4");
        System.out.println();
        MainArgs.main(new String("ff"), "dd");
    }
}


class MainArgs {
    public static void main(String... args) {
        for(String s: args) {
            System.out.print(s + " ");
        }
    }
}
