package lesson17Practice.deadlock;

public class First {
    private Second second;

    public Second getSecond() {
        return second;
    }

    public void setSecond(Second second) {
        this.second = second;
    }

    public synchronized String getString(){
        return "First class";
    }

    public synchronized String getStringFromSecond(){
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return second.getString();
    }
}
