package lesson19;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample {
    Lock lock = new ReentrantLock();

    public void increment(int counter) {
        lock.lock();
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + counter++);
        }
    }

    public void decrement(int counter) {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + counter--);
        }
    }

    public void print() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " done");
        }
        lock.unlock();
    }
}
