package MultiTreadingLessons;

public class Situacyi {
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();
    public static void main(String[] args) {
        // Deadlock - ситуация, когда 2 или более потоков залочены навсегда, ожидают друг друга и ничего не делают
        // Livelock - ситуация, когда 2 и более потоков залочены навсегда, ожидют друг друга, проделыват какую-то работу, но без какого либо прогресса
        // Lock starvation - ситуация, когда менее приоритетные потоки ждут долгое время или все время для того, чтобы могли запуститься
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        thread1.start();
        thread2.start();

    }
}

class Thread1 extends Thread{
    public void run(){
        System.out.println("Thread1: Попытка захватить монитор объекта lock1");
        synchronized (Situacyi.lock1){
            System.out.println("Thread1:  монитор объекта lock1 захвачен");
            System.out.println("Thread1: Попытка захватить монитор объекта lock2");
            synchronized (Situacyi.lock2){
                System.out.println("Thread1:  монитор объекта lock2 захвачен");
            }
        }
    }
}

class Thread2 extends Thread{
    public void run(){
        System.out.println("Thread2: Попытка захватить монитор объекта lock2");
        synchronized (Situacyi.lock2){
            System.out.println("Thread2:  монитор объекта lock2 захвачен");
            System.out.println("Thread2: Попытка захватить монитор объекта lock1");
            synchronized (Situacyi.lock1){
                System.out.println("Thread1:  монитор объекта lock1 захвачен");
            }
        }
    }
}
