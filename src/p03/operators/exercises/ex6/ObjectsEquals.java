package p03.operators.exercises.ex6;


class Dog {
    String name, says;
}

public class ObjectsEquals {
    public static void main(String[] args) {
        Dog spot = new Dog();
        Dog scruffy = new Dog();

        System.out.println("Name spot: " + spot.name);
        System.out.println("Name says: " + spot.says);
        System.out.println();

        System.out.println("Name scruffy: " + scruffy.name);
        System.out.println("Name scruffy: " + scruffy.says);
        System.out.println();

        Dog dog = spot;

        System.out.println(dog.equals(spot));
    }
}
