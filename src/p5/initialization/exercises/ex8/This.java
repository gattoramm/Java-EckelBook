package p5.initialization.exercises.ex8;


public class This {
    static class ToThisOrNotToThis {
        public void MethodOne() {
            MethodTwo();
            this.MethodTwo();
            System.out.println("MethodOne()");
        }

        public void MethodTwo() {
            System.out.println("MethodTwo()");
        }
    }

    public static void main(String[] args) {
        new ToThisOrNotToThis().MethodOne();
    }
}
