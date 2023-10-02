package p07.reusing.exercises.ex5;


class A {
    A() {
        System.out.println("Конструктор A");
    }
}

class B extends A {
    B() {
        System.out.println("Конструктор B");
    }
}

public class C extends A {
    B b = new B();

    public static void main(String[] args) {
        C cartoon = new C();
    }
}
