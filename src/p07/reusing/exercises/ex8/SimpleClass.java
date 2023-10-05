package p07.reusing.exercises.ex8;

class BaseClass {
    BaseClass(int i) {
        System.out.println("Конструктор BaseClass с параметром " + i);
    }
}

public class SimpleClass extends BaseClass {
    public SimpleClass() {
        super(11);
        System.out.println("Конструктор SimpleClass по умолчанию");
    }

    public SimpleClass(int i) {
        this();
        System.out.println("Конструктор SimpleClass с параметром " + i);
    }

    public static void main(String[] args) {
        SimpleClass cartoon = new SimpleClass(15);
    }
}
