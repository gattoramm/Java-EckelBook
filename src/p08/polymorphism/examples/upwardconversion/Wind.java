package p08.polymorphism.examples.upwardconversion;


public class Wind extends Instrument {
    @Override
    public void play(Music.Note n) {
        System.out.println("Wind.play() " + n);
    }
}
