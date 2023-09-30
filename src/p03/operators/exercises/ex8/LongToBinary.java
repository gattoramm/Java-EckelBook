package p03.operators.exercises.ex8;


public class LongToBinary {
    public static void main(String[] args) {
        long l1 = 1000000000L;
        long l2 = 2000000000l;

        System.out.println("l1 = " + l1);
        System.out.println("l2 = " + l2);

        System.out.println("Binary:");
        System.out.println("l1 = " + Long.toBinaryString(l1));
        System.out.println("l2 = " + Long.toBinaryString(l2));
    }
}
