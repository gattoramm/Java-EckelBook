package p05.initialization.exercises.ex4;


public class OverConstructors {
    static class SomeStr {
        SomeStr() {
            System.out.println("Hello!");
        }

        SomeStr(String str) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        new SomeStr();
        new SomeStr("World!");
    }
}
