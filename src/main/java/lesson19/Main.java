package lesson19;

import lesson19.deadLockExample.DeadLockExample;
import lesson19.deadLockExample.Thread1;
import lesson19.deadLockExample.Thread2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    private static final ExecutorService executorService = Executors.newFixedThreadPool(2);
    private static final AtomicInteger atomicInteger = new AtomicInteger(20000);
    private static final Object syncObject = new Object();

    public static void main(String[] args) {

        //Task 1 - ThreadPool

        for (int i = 0; i < 2; i++) {
            int numberThread = i;
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    workWithTread(numberThread);
                }
            });
        }
        executorService.shutdownNow();

        //Task 2 - Lock
//        lockThreads();

        //Task 3 - Deadlock
        DeadLockExample obj1 = new DeadLockExample();
        DeadLockExample obj2 = new DeadLockExample();

        Thread1 thread1 = new Thread1(obj1, obj2);
        Thread2 thread2 = new Thread2(obj1, obj2);

//        thread1.start();
//        thread2.start();
    }

    private static void workWithTread(int numberThread) {

        for (int i = 0; i < 10000; i++) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    synchronized (syncObject) {
                        atomicInteger.decrementAndGet();
                        System.out.println("pool-" + numberThread + "-" + Thread.currentThread().getName() + " atomic:" + atomicInteger);
                    }
                }
            });
            thread.start();
        }
    }

    private static void lockThreads() {

        final LockExample lockExample = new LockExample();
        for (int i = 0; i < 3; i++) {
            Thread thread = new Thread(new Runnable() {

                @Override
                public void run() {
                    lockExample.increment(0);
                    lockExample.decrement(100);
                    lockExample.print();
                }
            });
            thread.start();
        }
    }
}
