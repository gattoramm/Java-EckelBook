package p07.reusing.examples.delegacy;

public class SpaceShipDelegation {
    private String name;
    private SpaceShipControls control = new SpaceShipControls();

    public SpaceShipDelegation(String name) {
        this.name = name;
    }

    // Делегированные методы
    public void back(int velocity) {
        control.back(velocity);
    }

    public void up(int velocity) {
        control.up(velocity);
    }

    public void down(int velocity) {
        control.down(velocity);
    }

    public void left(int velocity) {
        control.left(velocity);
    }

    public void right(int velocity) {
        control.right(velocity);
    }

    public void forward(int velocity) {
        control.forward(velocity);
    }

    public void turboBoost(int velocity) {
        control.turboBoost(velocity);
    }

    public static void main(String[] args) {
        SpaceShipDelegation protector = new SpaceShipDelegation("Protector");
        protector.forward(100);
    }
}
