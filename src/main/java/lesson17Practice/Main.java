package lesson17Practice;

//Multithreading(part2) - Synchronized, Deadlock, wait();-notify();

import lesson17Practice.deadlock.First;
import lesson17Practice.deadlock.Second;

public class Main {


    public static void main(String[] args) throws InterruptedException {

        //synchronized
//        SyncService syncService = new SyncService();
//        Person person = new Person();
//        for (int i = 0; i < 5; i++) {
//            Thread thread = new Thread(() -> syncService.checkSyncObjectPart(person));
//            thread.start(); // with synchronized & without synchronized
//            thread.join();  // Result: 5000
//        }
//        System.out.println("Result: " + syncService.getVar());


        //deadlock
//        First first = new First();
//        Second second = new Second();
//        first.setSecond(second);
//        second.setFirst(first);
//
//        Thread firstThread = new Thread(() -> System.out.println(first.getStringFromSecond()));
//        Thread secondThread = new Thread(() -> System.out.println(second.getStringFromFirst()));
//        firstThread.start();
//        secondThread.start();

        //wait() vs notify()

        Object o = new Object();
        Thread thread = new Thread(() -> {
            synchronized (o) {  //1.lock
                for (int i = 0; i < 10; i++) {
                    System.out.println("thread running: " + Thread.currentThread().getName());
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                o.notify(); //3.end of work(thread is done)
            }
        });
        thread.start();
        synchronized (o) {
            o.wait();   //2.wait, while in progress(thread)
        }
        System.out.println("Finished");
        System.out.println("Finished");
    }
}
