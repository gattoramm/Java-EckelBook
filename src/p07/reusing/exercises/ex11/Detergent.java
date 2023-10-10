package p07.reusing.exercises.ex11;

class Cleanser {
    private String s = "Cleanser";
    public void append(String a) {
        s += a;
    }

    public void dilute() {
        append(" dilute()");
    }

    public void apply() {
        append(" apply()");
    }

    public void scrub() {
        append(" scrub()");
    }

    @Override
    public String toString() {
        return s;
    }
}

public class Detergent {
    String s;
    Cleanser cleanser = new Cleanser();

    // Делегированные методы
    public void dilute() {
        cleanser.dilute();
    }

    public void apply() {
        cleanser.apply();
    }

    public void scrub() {
        cleanser.scrub();
    }

    public static void main(String[] args) {
        Detergent d = new Detergent();
        d.dilute();
        d.apply();
        d.scrub();

        System.out.println(d.cleanser);
    }
}
