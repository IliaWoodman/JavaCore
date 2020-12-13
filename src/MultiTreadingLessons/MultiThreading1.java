package MultiTreadingLessons;

public class MultiThreading1 extends Thread {
    public void run(){
        for (int i = 9999; i < 10999; i++) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();//первый поток, наследую класс Thread
        Thread thread2 = new Thread(new MyThread2());// второй поток, реализуя интерфейс Runnable
        MultiThreading1 thread3 =new MultiThreading1(); //третий поток наследую класс Thread
        new Thread(new Runnable() { // четвертый поток, через анонимный класс
            @Override
            public void run() {
                System.out.println("Privet");
            }
        }).start();

        new Thread(()-> System.out.println("privet")).start();//пятый поток, через лямбду

        myThread1.start();
        thread2.start();
        thread3.start();

    }
}

class MyThread1 extends Thread{
    public void run(){
        for (int i = 0; i < 1001; i++) {
            System.out.println(i);
        }
    }
}

class MyThread2 implements Runnable{
    public void run(){
        for (int i = 1000; i > 0; i--) {
            System.out.println(i);
        }
    }
}
