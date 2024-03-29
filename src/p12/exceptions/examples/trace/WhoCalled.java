package p12.exceptions.examples.trace;

public class WhoCalled {
    static void f() {
        // Генерируем исключение для заполнения трассировки стека
        try {
            throw new Exception();
        } catch (Exception e) {
            for (StackTraceElement ste : e.getStackTrace()) {
                System.out.println(ste.getMethodName());
            }
        }
    }

    static void g() { f(); }
    static void h() { g(); }

    public static void main(String[] args) {
        f();
        System.out.println("---------------------");
        g();
        System.out.println("---------------------");
        h();
    }
}
