package lesson3.lesson2;

public class House {
    private Table table;
    private Sofa sofa;
    private Computer computer;

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public Sofa getSofa() {
        return sofa;
    }

    public void setSofa(Sofa sofa) {
        this.sofa = sofa;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public House(Table table, Sofa sofa, Computer computer) {
        this.table = table;
        this.sofa = sofa;
        this.computer = computer;
    }
}

class Table {
    private int height;
    private String color;
    private String material;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Table(int height, String color, String material) {
        this.height = height;
        this.color = color;
        this.material = material;
    }
}

class Sofa {
    private String color;
    private int length;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Sofa(String color, int length) {
        this.color = color;
        this.length = length;
    }
}

class Computer {
    private String name;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Computer(String name, String color) {
        this.name = name;
        this.color = color;
    }
}