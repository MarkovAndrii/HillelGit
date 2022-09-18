package lesson4;

import lesson4.connection.Laptop;
import lesson4.connection.SmartWatch;
import lesson4.connection.Smartphone;
import lesson4.transport.Bus;
import lesson4.transport.PassengerCar;
import lesson4.transport.Truck;
import lesson4.transport.Vehicle;

public class Main {
    public static void main(String[] args) {
        Truck truck = new Truck("DAF", "FB2438", "truck", "black", 8.5, 5.0);
        truck.startEngine();
        truck.move();
        truck.load();
        truck.unload();
        truck.goForward();
        truck.turn("left");
        truck.accelerate();
        truck.toBreak();
        System.out.println();

        PassengerCar passengerCar = new PassengerCar("Audi", "A6", "passenger car", "blue", "sedan", true);
        passengerCar.startEngine();
        passengerCar.move();
        passengerCar.openTrunc();
        passengerCar.goForward();
        passengerCar.turn("right");
        passengerCar.accelerate();
        passengerCar.toBreak();
        System.out.println();

        Bus bus = new Bus("Volvo", "V150", "bus", "yelow", 18, 12);
        bus.startEngine();
        bus.move();
        bus.openDoors();
        bus.closeDoors();
        bus.goForward();
        bus.turn("to bus stop");
        bus.accelerate();
        bus.toBreak();
        System.out.println();

        Smartphone smartphone = new Smartphone("OPPO", "A54", "plastic", "smartphone", 5.5, 2);
        smartphone.smartphoneCall();
        smartphone.sendInformation();
        smartphone.useInternet();
        smartphone.call();
        smartphone.talk();
        smartphone.sendMessage();
        smartphone.downloadPhoto();
        smartphone.repair();
        smartphone.charged();
        System.out.println();

        SmartWatch smartWatch = new SmartWatch("Apple", "5 series", "alum", "smatrWatch", 15, "gold");
        smartWatch.pay();
        smartWatch.sendInformation();
        smartWatch.useInternet();
        smartWatch.call();
        smartWatch.talk();
        smartWatch.sendMessage();
        smartWatch.downloadPhoto();
        smartWatch.repair();
        smartWatch.charged();
        System.out.println();

        Laptop laptop = new Laptop("HP", "A1519", "steel", "laptop", 108, 12);
        laptop.work();
        laptop.sendInformation();
        laptop.useInternet();
        laptop.call();
        laptop.talk();
        laptop.sendMessage();
        laptop.downloadPhoto();
        laptop.repair();
        laptop.charged();

        // Vehicle vehicle = new Vehicle("weew","ddd"); - екземпляр абстрактного класса не может бить создан
    }
}
