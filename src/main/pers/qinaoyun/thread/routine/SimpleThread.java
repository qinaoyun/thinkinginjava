package main.pers.qinaoyun.thread.routine;

/**
 * Description:测试多线程
 *
 * @author qinaoyun
 *         Date: 2017-12-15
 *         Time: 10:54
 */
public class SimpleThread extends Thread {
    private int countDown = 5;
    private int threadNumber;
    private static int threadCount = 0;

    public SimpleThread() {
        threadNumber = ++threadCount;
        System.out.println("Making " + threadNumber);
    }

    public void run() {
        while (true) {
            System.out.println("Thread " +
                    threadNumber + "(" + countDown + ")");
            if (--countDown == 0) return;
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++)
            new SimpleThread().start();
        System.out.println("All Threads Started");
    }
} ///:~