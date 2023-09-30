package p03.operators.exercises.ex14;


public class StringOperations {
    static void f(boolean b) {
        System.out.println(b);
    }

    static void stringTest(String str1, String str2) {
        //Арифметические операции
        System.out.println("str1 = " + str1 + ", str2 = " + str2);
        System.out.println("str1+str2 = " + str1+str2);
        // Операции сравнения и логические операции
        System.out.println("str1!=str2");
        f(str1!=str2);
        System.out.println("str1==str2");
        f(str1==str2);
        System.out.println("str1.equals(str2)");
        f(str1.equals(str2));

    }

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = new String("Hello");

        stringTest(str1, str2);
        System.out.println("------------");
        stringTest(str1, str3);
    }
}
