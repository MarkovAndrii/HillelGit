package lesson19.deadLockExample;

public class Thread2 extends Thread {
    DeadLockExample obj1, obj2;

    public Thread2(DeadLockExample obj1, DeadLockExample obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public void run() {
        synchronized (obj2) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                System.out.println(ie);
            }
            obj1.output1(obj1);
        }
    }
}
