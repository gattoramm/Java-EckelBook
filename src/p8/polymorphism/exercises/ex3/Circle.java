package p8.polymorphism.exercises.ex3;


public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Circle.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Circle.erase()");
    }

    @Override
    public void info() {
        System.out.println("Output Circle");
    }
}
