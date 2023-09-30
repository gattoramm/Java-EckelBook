package p8.polymorphism.exercises.ex5;


public class Unicycle extends Cycle {
    @Override
    public void ride(Wheel.Transport t) {
        System.out.println("Unicycle.ride() " + Wheel.Transport.ONE_WHEEL);
    }
}
