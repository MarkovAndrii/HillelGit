package lesson19.deadLockExample;

public class DeadLockExample {

    void output1(DeadLockExample obj2) {
        System.out.println("Thread1 waiting for thread2 to release lock");
        synchronized (obj2) {
            System.out.println("Deadlock occurred");
        }
    }

    void output2(DeadLockExample obj1) {
        System.out.println("Thread2 waiting for thread1 to release lock");
        synchronized (obj1) {
            System.out.println("Deadlock occurred");
        }
    }
}
