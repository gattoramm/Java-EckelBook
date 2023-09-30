package p05.initialization.exercises.ex3;


public class DefaultConstructor {
    static class SomeStr {
        public SomeStr() {
            System.out.println("Hello!");
        }
    }

    public static void main(String[] args) {
        SomeStr str = new SomeStr();
    }
}
