package p07.reusing.examples.delegacy;

public class SpaceShip extends SpaceShipControls {
    private String name;

    public SpaceShip(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        SpaceShip spaceShip = new SpaceShip("SpaceShip");
        spaceShip.forward(100);
    }
}
