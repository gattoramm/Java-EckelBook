package p08.polymorphism.exercises.ex1;


public class Cycle {
    public enum Transport {
        ONE_WHEEL, TWO_WHEEL, THREE_WHEEL;
    }

    public void ride(Transport t) {
        System.out.println("Cycle.play()");
    }
}
