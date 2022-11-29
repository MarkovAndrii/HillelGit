package lesson17Practice.deadlock;

public class Second {
    private First first;

    public First getFirst() {
        return first;
    }

    public void setFirst(First first) {
        this.first = first;
    }

    public synchronized String getString(){
        return "Second class";
    }

    public synchronized String getStringFromFirst(){
        return first.getString();
    }
}
