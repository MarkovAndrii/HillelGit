package lesson4.transport;

public final class Truck extends Car {
    private double volume;
    private double maxCarGoWeight;

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getMaxCarGoWeight() {
        return maxCarGoWeight;
    }

    public void setMaxCarGoWeight(double maxCarGoWeight) {
        this.maxCarGoWeight = maxCarGoWeight;
    }

    public Truck(String brand, String model, String formfactor, String color, double volume, double maxCarGoWeight) {
        super(brand, model, formfactor, color);
        this.volume = volume;
        this.maxCarGoWeight = maxCarGoWeight;
    }

    public void load() {
        System.out.println("Truck loading");
    }

    public void unload() {
        System.out.println("Truck unloading");
    }

    @Override
    public void startEngine() {
        System.out.println("Truck start engine...ggggg");
    }

    @Override
    public void move() {
        //super.move();
        System.out.println("Truck moving");
    }
}
