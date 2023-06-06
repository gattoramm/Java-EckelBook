package p9_Interfaces.Exercises.Ex3;


abstract class AbsClass {
    int i;
    abstract void print();
}

class BaseClass extends AbsClass {
    int i = 8;
    @Override
    void print() {
        System.out.println(i);
    }

    public BaseClass() {
        print();
    }
}

public class Main {
    public static void main(String[] args) {
        BaseClass baseClass = new BaseClass();
        baseClass.print();
    }
}
