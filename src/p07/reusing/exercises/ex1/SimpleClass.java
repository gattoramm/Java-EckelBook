package p07.reusing.exercises.ex1;


class BaseClass {
    public String b;

    @Override
    public String toString() {
        return b;
    }
}

public class SimpleClass {
    private BaseClass baseClass = new BaseClass();
    private String simpleClass = "s";

    @Override
    public String toString() {
        if (baseClass.b == null)
            baseClass.b = "b";
        return
                "baseClass = " + baseClass +
                ", simpleClass = " + simpleClass;
    }

    public static void main(String[] args) {
        SimpleClass simpleClass = new SimpleClass();
        System.out.println(simpleClass);
    }
}
