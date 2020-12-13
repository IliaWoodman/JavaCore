package MultiTreadingLessons;

public class DataRaceSynchronized {
    // Data race это проблема , которая может возникнуть когда два и более потоков обращаются к одной и той же
    // переменной и как минимум 1 поток ее изменяет
    public static void main(String[] args) {
        MyRunnableEmpl1 runnable = new MyRunnableEmpl1();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Counter{
    static int count = 0;
}

class MyRunnableEmpl1 implements Runnable{
    public synchronized void increment(){
        Counter.count++;
        System.out.print(Counter.count + " ");
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            increment();
        }
    }
}
