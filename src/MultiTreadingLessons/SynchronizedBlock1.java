package MultiTreadingLessons;

public class SynchronizedBlock1 {
    // Монитор - это сущность/механизм, благодаря которому достигается корректная работа при синхронизации
    // В Java у каждого класса и объекта есть привязанный к нему монитор
    public static void main(String[] args) {
        MyRunnableEmpl2 runnable = new MyRunnableEmpl2();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);

        thread1.start();
        thread2.start();
        thread3.start();

    }
}

class Counter2 {
    static int count = 0;
}

class MyRunnableEmpl2 implements Runnable {

    private void doWork1() {
        doSmth();
        synchronized (this) {
            Counter2.count++;
            System.out.println(Counter2.count);
        }
    }

    private void doSmth(){
        System.out.println("privet");
    }
 // по сути одно и тоже
    public synchronized void doWork2() {
            Counter2.count++;
            System.out.println(Counter2.count);
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            doWork1();
        }
    }
}
