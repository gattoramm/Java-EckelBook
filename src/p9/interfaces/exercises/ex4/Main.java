package p9.interfaces.exercises.ex4;

abstract class AbsClass {abstract void method();}

class BaseClass extends AbsClass {
    void method() {
        System.out.println("In BaseClass");
    }
}

public class Main {
    static void link(AbsClass absClass) {
        ((BaseClass) absClass).method();
    }

    public static void main(String[] args) {
        BaseClass baseClass = new BaseClass();
        baseClass.method();
    }
}
