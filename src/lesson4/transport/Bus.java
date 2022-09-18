package lesson4.transport;

public final class Bus extends Car {
    private int passengerSeatsNumber;
    private int getPassengerStandingNumber;

    public int getPassengerSeatsNumber() {
        return passengerSeatsNumber;
    }

    public void setPassengerSeatsNumber(int passengerSeatsNumber) {
        this.passengerSeatsNumber = passengerSeatsNumber;
    }

    public int getGetPassengerStandingNumber() {
        return getPassengerStandingNumber;
    }

    public void setGetPassengerStandingNumber(int getPassengerStandingNumber) {
        this.getPassengerStandingNumber = getPassengerStandingNumber;
    }

    public Bus(String brand, String model, String formfactor, String color, int passengerSeatsNumber, int getPassengerStandingNumber) {
        super(brand, model, formfactor, color);
        this.passengerSeatsNumber = passengerSeatsNumber;
        this.getPassengerStandingNumber = getPassengerStandingNumber;
    }

    public void openDoors() {
        System.out.println("Doors opening...");
    }

    public void closeDoors() {
        System.out.println("Doors closing...");
    }

    @Override
    public void startEngine() {
        System.out.println("Bus start engine...vggg");
    }

    @Override
    public void move() {
        //super.move();
        System.out.println("Bus moving to school");
    }

}
