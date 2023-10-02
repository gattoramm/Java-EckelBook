package p07.reusing.exercises.ex7;


class A {
    A(int i) {
        System.out.println("Конструктор A");
    }
}

class B extends A {
    B(int i) {
        super(i);
        System.out.println("Конструктор B");
    }
}

public class C extends A {
    B b = new B(1);

    public C(int i) {
        super(i);
    }

    public static void main(String[] args) {
        C cartoon = new C(15);
    }
}
