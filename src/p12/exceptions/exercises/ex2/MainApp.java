package p12.exceptions.exercises.ex2;

class MyClass {
    void doStuff() {
        System.out.println("doStuff()");
    }
}

public class MainApp {
    public static void main(String[] args) {
        MyClass myClass = null;
        try {
            myClass.doStuff();
        } catch (NullPointerException npe) {
            System.out.println(npe);
        }

    }
}
