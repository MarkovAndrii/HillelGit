package lesson4.transport;

public abstract class Vehicle implements Speed {
    private String brand;
    private String model;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public abstract void move();

    @Override
    public void goForward() {
        System.out.println("Go forward");
    }

    @Override
    public void turn(String direction) {
        if (direction.equals("left")) {
            System.out.println("Turn left");
            //break;
        }
        else if (direction.equals("right")) {
            System.out.println("Turn right");
        } else {
            this.goForward();
        }
    }

    @Override
    public void accelerate() {
        System.out.println("Full accelerate");
    }

    @Override
    public void toBreak() {
        System.out.println("Break");
    }
}
