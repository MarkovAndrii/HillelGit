package lesson4.transport;

public final class PassengerCar extends Car {
    private String bodyType;
    private Boolean hasTowBar;   //фаркоп

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public Boolean getHasTowBar() {
        return hasTowBar;
    }

    public void setHasTowBar(Boolean hasTowBar) {
        this.hasTowBar = hasTowBar;
    }

    public PassengerCar(String brand, String model, String formfactor, String color, String bodyType, Boolean hasTowBar) {
        super(brand, model, formfactor, color);
        this.bodyType = bodyType;
        this.hasTowBar = hasTowBar;
    }

    public void openTrunc() {
        System.out.println("Passenger car opening trunc");
    }

    @Override
    public void startEngine() {
        System.out.println("PassengerCar start engine...vrummm");
    }

    @Override
    public void move() {
        //super.move();
        System.out.println("Passenger car moving on road");
    }
}
