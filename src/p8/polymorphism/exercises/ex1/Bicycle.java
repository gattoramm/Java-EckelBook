package p8.polymorphism.exercises.ex1;


public class Bicycle extends Cycle {
    @Override
    public void ride(Transport t) {
        System.out.println("Bicycle.ride() " + Transport.TWO_WHEEL);
    }
}
