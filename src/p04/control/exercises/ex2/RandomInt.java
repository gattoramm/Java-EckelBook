package p04.control.exercises.ex2;


public class RandomInt {
    public static void main(String[] args) {
        int num1, num2;

        for(int item = 0; item < 25; item++) {
            num1 = (int) ( Math.random()*100 );
            num2 = (int) ( Math.random()*100 );

            System.out.print("num1 = " + num1 + ",\tnum2 = " + num2 + ".\t\t");

            if (num1 == num2)
                System.out.println("num1 = num2");
            else if (num1 < num2)
                System.out.println("num1 < num2");
            else
                System.out.println("num1 > num2");
        }
    }
}
