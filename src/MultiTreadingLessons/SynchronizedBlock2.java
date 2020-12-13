package MultiTreadingLessons;

public class SynchronizedBlock2 {
    volatile static int counter = 0;

    public static void increment() {
        synchronized (SynchronizedBlock2.class) {
            counter++;
            System.out.println(counter);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new R());
        Thread thread2 = new Thread(new R());
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println(counter + " Result");
    }
}

class R implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            SynchronizedBlock2.increment();
        }
    }
}
