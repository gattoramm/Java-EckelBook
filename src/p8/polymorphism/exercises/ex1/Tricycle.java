package p8.polymorphism.exercises.ex1;


public class Tricycle extends Cycle{
    @Override
    public void ride(Transport t) {
        System.out.println("Tricycle.ride() " + Transport.THREE_WHEEL);
    }
}
