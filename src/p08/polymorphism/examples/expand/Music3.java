package p08.polymorphism.examples.expand;

class Instrument {
    void play(Music3.Note n) { System.out.println("Instrument.play() " + n); }
    String what() { return "Instrument"; }
    void adjust() { System.out.println("Adjusting Instrument"); }
}

class Wind extends Instrument {
    void play(Music3.Note n) { System.out.println("Wind.play() " + n); }
    String what() { return "Wind"; }
    void adjust() { System.out.println("Adjusting Wind"); }
}

class Percussion extends Instrument {
    void play(Music3.Note n) { System.out.println("Percussion.play() " + n); }
    String what() { return "Percussion"; }
    void adjust() { System.out.println("Adjusting Percussion"); }
}

class Stringed extends Instrument {
    void play(Music3.Note n) { System.out.println("Stringed.play() " + n); }
    String what() { return "Stringed"; }
    void adjust() { System.out.println("Adjusting Stringed"); }
}

class Brass extends Wind {
    void play(Music3.Note n) { System.out.println("Brass.play() " + n); }
    void adjust() { System.out.println("Adjusting Brass"); }
}

class Woodwind extends Wind {
    void play(Music3.Note n) { System.out.println("Woodwind.play() " + n); }
    void adjust() { System.out.println("Adjusting Woodwind"); }
}

public class Music3 {
    public enum Note {
        MIDDLE_C, C_SHARP, B_FLAT;
    }
}
