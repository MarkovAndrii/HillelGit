package lesson4.connection;

public abstract class Gadget extends MeansOfCommunication {
    private String material;
    private String type;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Gadget(String brand, String model, String material, String type) {
        super(brand, model);
        this.material = material;
        this.type = type;
    }

    public abstract void useInternet();

    @Override
    public void sendInformation() {
        System.out.println("User send information");
    }
}
