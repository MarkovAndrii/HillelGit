package lesson17;

public class CustomRunnable implements Runnable{
    @Override
    public void run() {
        Thread.currentThread().setName("RunnableThread");
        for (int i = 0; i < 1000; i++) {
            System.out.println(ThreadProcessing.workWithThread());
        }
    }
}
