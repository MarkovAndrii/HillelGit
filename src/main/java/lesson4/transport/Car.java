package lesson4.transport;

public abstract class Car extends Vehicle {
    private String formfactor;
    private String color;

    public String getFormfactor() {
        return formfactor;
    }

    public void setFormfactor(String formfactor) {
        this.formfactor = formfactor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Car(String brand, String model, String formfactor, String color) {
        super(brand, model);
        this.formfactor = formfactor;
        this.color = color;
    }

    public abstract void startEngine();

    @Override
    public void move() {
        System.out.println("Car moving");
    }
}
