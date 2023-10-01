package p07.reusing.exercises.ex2;

import p07.reusing.examples.inheritance.Detergent;

public class MyClass extends Detergent {
    @Override
    public void scrub() {
        append(" MyClass.scrub()");
        super.scrub();
    }

    public void sterillize() {
        append(" sterillize()");
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.dilute();
        myClass.apply();
        myClass.scrub();
        myClass.foam();
        myClass.sterillize();
        System.out.println(myClass);
    }
}
