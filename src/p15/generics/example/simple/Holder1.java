package p15.generics.example.simple;

class Automobile {}

public class Holder1 {
    private Automobile a;

    public Holder1(Automobile a) {
        this.a = a;
    }

    Automobile get() { return a; }
}
