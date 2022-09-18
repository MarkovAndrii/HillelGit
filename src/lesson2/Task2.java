package lesson2;

public class Task2 {

    private final int varInt;
    private final double varDouble;
    private final String varString;

    public Task2() {
        varInt = 1;
        varDouble = 1000;
        varString = "Hello";
    }

    public Task2(int varInt, double varDouble, String varString) {
        this.varInt = varInt;
        this.varDouble = varDouble;
        this.varString = varString;
    }

    public int getVarInt() {
        return varInt;
    }

    /*public void setVarInt(int varInt) {
        this.varInt = varInt;             // Невозможно задать новое значение, т.к. тип поле final(неизменяемое)
    }*/

    public double getVarDouble() {
        return varDouble;
    }

    /*public void setVarDouble(double varDouble){
        this.varDouble=varDouble;         // Невозможно задать новое значение, т.к. тип поле final(неизменяемое)
    }*/

    public String getVarString() {
        return varString;
    }
    /*public void setVarString(String varString){
        this.varString=varString;         // Невозможно задать новое значение, т.к. тип поле final(неизменяемое)
    }*/
}
