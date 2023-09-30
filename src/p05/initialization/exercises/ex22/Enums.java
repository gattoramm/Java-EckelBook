package p05.initialization.exercises.ex22;


enum Money {
    DOLLAR, EURO, POUND, RUBBLE, YEN, PESO
}

public class Enums {
    Money money;
    public Enums(Money money) {
        this.money = money;
    }
    public void describe() {
        System.out.print("This money is ");
        switch(money) {
            case RUBBLE:
                System.out.println("Rubble");
                break;
            case YEN:
            case EURO:
                System.out.println("Euro");
                break;
            case PESO:
            case POUND:
            case DOLLAR:
                System.out.println("Dollar");
                break;
        }
    }

    public static void main(String[] args) {
        new Enums(Money.DOLLAR).describe();
        new Enums(Money.RUBBLE).describe();
        new Enums(Money.EURO).describe();
    }
}
