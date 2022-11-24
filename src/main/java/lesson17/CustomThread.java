package lesson17;

public class CustomThread extends Thread {
    @Override
    public void run() {
        Thread.currentThread().setName("CustomThread");
        for (int i = 0; i < 1000; i++) {
            System.out.println(ThreadProcessing.workWithThread(Thread.currentThread()));
        }
    }
}
