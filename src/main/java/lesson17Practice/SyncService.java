package lesson17Practice;

public class SyncService {

    private int var = 0;

    public int getVar() {
        return var;
    }

    private synchronized void checkSync() { //synchronized method
        for (int i = 0; i < 100; i++) {
            var++; //increment(3 action) - no atomic operation
        }
    }

    public void checkSyncPart() {    //no static method
        for (int i = 0; i < 100; i++) {
            System.out.println("Thread async: " + Thread.currentThread().getName());
        }
        synchronized (this) {   //synchronized within method
            for (int i = 0; i < 100; i++) {
                System.out.println("THREAD SYNC: " + Thread.currentThread().getName());
            }
        }
    }

    public void checkSyncObject() {
        Object object = new Object();
        Person person = new Person();   //create object within method - synchronized doesn't work
        synchronized (person) {
            for (int i = 0; i < 100; i++) {
                System.out.println("Sync person: "+ Thread.currentThread().getName());
            }
        }
    }

    //synchronized object
    public void checkSyncObjectPart(Person person) { //transfer object to method - synchronized work(only one object for all threads)
        synchronized (person) {
            for (int i = 0; i < 100; i++) {
                System.out.println("Sync person: "+ Thread.currentThread().getName());
            }
        }
    }
}
