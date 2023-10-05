package p07.reusing.exercises.ex3;

class Art {
    Art() {
        System.out.println("Конструктор Art");
    }
}

class Drawing extends Art {
    Drawing() {
        System.out.println("Конструктор Drawing");
    }
}

public class Cartoon extends Drawing{

    public static void main(String[] args) {
        Cartoon cartoon = new Cartoon();
    }
}
