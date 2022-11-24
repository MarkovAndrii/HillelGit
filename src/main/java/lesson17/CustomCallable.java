package lesson17;

import java.util.concurrent.Callable;

public class CustomCallable implements Callable<Object> {
    @Override
    public Object call() throws Exception {
        Thread.currentThread().setName("CallableThread");
        for (int i = 0; i < 1000; i++) {
          System.out.println(ThreadProcessing.workWithThread(Thread.currentThread()));
        }
        return Thread.currentThread().isAlive();    //don't use return
    }
}
