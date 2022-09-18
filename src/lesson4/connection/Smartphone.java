package lesson4.connection;

public final class Smartphone extends Gadget {
    private double sizeTouchscreen;
    private int numberOfSimCards;

    public double getSizeTouchscreen() {
        return sizeTouchscreen;
    }

    public void setSizeTouchscreen(double sizeTouchscreen) {
        this.sizeTouchscreen = sizeTouchscreen;
    }

    public int getNumberOfSimCards() {
        return numberOfSimCards;
    }

    public void setNumberOfSimCards(int numberOfSimCards) {
        this.numberOfSimCards = numberOfSimCards;
    }

    public Smartphone(String brand, String model, String material, String type, double sizeTouchscreen, int numberOfSimCards) {
        super(brand, model, material, type);
        this.sizeTouchscreen = sizeTouchscreen;
        this.numberOfSimCards = numberOfSimCards;
    }

    public void smartphoneCall() {
        System.out.println("Smartphone call...");
    }

    @Override
    public void useInternet() {
        System.out.println("User finds information on the Internet");
    }

    @Override
    public void sendInformation() {
        super.sendInformation();
    }
}
