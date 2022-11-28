package lesson17;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        CustomThread thread = new CustomThread();
        thread.start();
//        thread.join();

        CustomRunnable customRunnable = new CustomRunnable();
        Thread threadRunnable = new Thread(customRunnable);
        threadRunnable.start();
//        threadRunnable.join();

        CustomCallable customCallable = new CustomCallable();
        FutureTask<Object> task = new FutureTask<>(customCallable);
        Thread threadCallable = new Thread(task);
        threadCallable.start();
//        threadCallable.join();

//        Object result = task.get();
//        System.out.println(result);


//        System.out.println(ThreadProcessing.workWithThread(Thread.currentThread()));  //currentThread = main

    }
}
