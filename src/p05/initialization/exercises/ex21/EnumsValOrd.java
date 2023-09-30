package p05.initialization.exercises.ex21;


enum Money {
    DOLLAR, EURO, POUND, RUBBLE, YEN, PESO
}

public class EnumsValOrd {
    public static void main(String[] args) {
        for (Money m : Money.values()) {
            System.out.println(m + ", ordinal " + m.ordinal());
        }
    }
}
