package lesson17;

public class ThreadProcessing {

    private static int threadNumber;

    //First option
    //task5 = always 3000-3000
//    public static int workWithThread(Thread thread) {   //add synchronized here
//        System.out.print(thread.getName() + " " + threadNumber + " - ");
//        return ++threadNumber;
//    }

    //Second option
    //task5.1 = 1001-1801
    //task5.2 = 3000-3000
    //task5.3 = 3000-3000
    public static int workWithThread(Thread thread) {   //add synchronized here
        int val = threadNumber;
        System.out.println(thread.getName() + " " + val + " - ");
        threadNumber = val + 1;
        return threadNumber;
    }
}
