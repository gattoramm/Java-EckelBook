package p02.objects.exercises.ex1;


public class DefaultInit {

    public static class SomeIntChr {
        int someNum;
        char someChr;
    }

    public static void main(String[] args) {
        SomeIntChr num = new SomeIntChr();
        System.out.println("someNum = " + num.someNum);
        System.out.println("someChr = " + num.someChr);
    }
}
