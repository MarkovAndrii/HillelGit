package lesson4.connection;

public final class SmartWatch extends Gadget {
    private int numbersOfBiometricsFunctions;
    private String color;

    public int getNumbersOfBiometricsFunctions() {
        return numbersOfBiometricsFunctions;
    }

    public void setNumbersOfBiometricsFunctions(int numbersOfBiometricsFunctions) {
        this.numbersOfBiometricsFunctions = numbersOfBiometricsFunctions;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public SmartWatch(String brand, String model, String material, String type, int numbersOfBiometricsFunctions, String color) {
        super(brand, model, material, type);
        this.numbersOfBiometricsFunctions = numbersOfBiometricsFunctions;
        this.color = color;
    }

    public void pay() {
        System.out.println("Smart Watch pay");
    }

    @Override
    public void useInternet() {
        System.out.println("Update data online");
    }

    @Override
    public void sendInformation() {
        super.sendInformation();
    }
}
