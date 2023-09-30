package p5.initialization.exercises.ex10;


class SomeClass {
    public void finalize() {
        System.out.println("Проверка finalize и условия готовности");
    }
}

public class Finalize {
    public static void main(String[] args) {
        new SomeClass();
        System.gc();
    }
}
