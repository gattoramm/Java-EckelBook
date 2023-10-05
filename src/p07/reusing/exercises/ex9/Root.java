package p07.reusing.exercises.ex9;

class Component1 {
    public Component1() {
        System.out.println("Component1");
    }
}

class Component2 {
    public Component2() {
        System.out.println("Component2");
    }
}

class Component3 {
    public Component3() {
        System.out.println("Component3");
    }
}

class Root {
    Component1 component1;
    Component2 component2;
    Component3 component3;

    public Root() {
        System.out.println("Root");
    }
}
