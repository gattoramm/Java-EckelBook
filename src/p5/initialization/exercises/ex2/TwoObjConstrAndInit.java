package p5.initialization.exercises.ex2;


public class TwoObjConstrAndInit {
    static class SomeString {
        String someStr;
        SomeString() {
            someStr = "SomeStr";
        }

        SomeString(String str) {
            someStr = str;
        }
    }

    public static void main(String[] args) {
        SomeString str1 = new SomeString();
        SomeString str2 = new SomeString("asd");

        System.out.println(str1.someStr);
        System.out.println(str2.someStr);
    }
}
