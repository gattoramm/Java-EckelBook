package p05.initialization.exercises.ex6;


public class ReverseOverMethod {
    static class Dog {

        void bark(String str, int num) {
            System.out.println("Вой символами \"" + str + "\" " + num + " раз");
        }

        void bark(int num, String str) {
            System.out.println("Поскуливание символами \"" + str + "\" " + num + " раз");
        }
    }

    public static void main(String[] args) {
        new Dog().bark(2, "q");
        new Dog().bark("w", 2);
    }
}
