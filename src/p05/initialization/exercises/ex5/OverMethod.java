package p05.initialization.exercises.ex5;

public class OverMethod {
    static class Dog {
        void bark() {
            System.out.println("Лай");
        }

        void bark(String str) {
            System.out.println("Вой");
        }

        void bark(int num) {
            System.out.println("Поскуливание");
        }
    }

    public static void main(String[] args) {
        new Dog().bark();
        new Dog().bark(1);
        new Dog().bark("q");
    }
}
