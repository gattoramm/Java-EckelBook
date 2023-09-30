package p8.polymorphism.exercises.ex5;


public class Bicycle extends Cycle {
    @Override
    public void ride(Wheel.Transport t) {
        System.out.println("Bicycle.ride() " + Wheel.Transport.TWO_WHEEL);
    }
}
