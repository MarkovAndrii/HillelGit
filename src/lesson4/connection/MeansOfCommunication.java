package lesson4.connection;

public abstract class MeansOfCommunication implements Content, Service {
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

    public MeansOfCommunication(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public abstract void sendInformation();


    @Override
    public void call() {
        System.out.println("Call to user");
    }

    @Override
    public void talk() {
        System.out.println("Сarry on a conversation");
    }

    @Override
    public void sendMessage() {
        System.out.println("Send message to user");
    }

    @Override
    public void downloadPhoto() {
        System.out.println("Download photo");
    }

    @Override
    public void repair() {
        System.out.println("Сarry out scheduled repairs");
    }

    @Override
    public void charged() {
        System.out.println("Charge device");
    }
}
