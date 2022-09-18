package lesson4.connection;

public final class Laptop extends Gadget {
    private int numberOfKeys;
    private int numberOfPorts;

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public void setNumberOfKeys(int numberOfKeys) {
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfPorts() {
        return numberOfPorts;
    }

    public void setNumberOfPorts(int numberOfPorts) {
        this.numberOfPorts = numberOfPorts;
    }

    public Laptop(String brand, String model, String material, String type, int numberOfKeys, int numberOfPorts) {
        super(brand, model, material, type);
        this.numberOfKeys = numberOfKeys;
        this.numberOfPorts = numberOfPorts;
    }

    public void work() {
        System.out.println("Work on laptop");
    }

    @Override
    public void useInternet() {
        System.out.println("Сhat with friends online");
    }

    @Override
    public void sendInformation() {
        super.sendInformation();
    }

    @Override
    public void call() {
        System.out.println("Skype call...");
    }

    @Override
    public void talk() {
        System.out.println("Talk by video conference");
    }
}
