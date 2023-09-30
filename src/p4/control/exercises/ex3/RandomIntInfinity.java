package p4.control.exercises.ex3;


public class RandomIntInfinity {
    public static void main(String[] args) {
        int num1, num2;

       while(true) {
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
