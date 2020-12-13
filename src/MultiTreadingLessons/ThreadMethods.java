package MultiTreadingLessons;

public class ThreadMethods extends Thread {

    @Override
    public void run() {
        for (int i = 1; i < 10 ; i++) {
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {

                                            //getName, setName, getPriority, setPriority

//        MyThread3 myThread1 = new MyThread3();
//        System.out.println("Name of myThread3 = " + myThread1.getName());
//        System.out.println("Priority of myThread3 = " + myThread1.getPriority());
//        myThread1.setName("Super 1 potok");
//        myThread1.setPriority(9);
//        System.out.println("Name of myThread3 = " + myThread1.getName());
//        System.out.println("Priority of myThread3 = " + myThread1.getPriority());
//        System.out.println();
//        MyThread3 myThread2 = new MyThread3();
//        System.out.println("Name of myThread3 = " + myThread2.getName());
//        System.out.println("Priority of myThread3 = " + myThread2.getPriority());
//        myThread2.setName("Super 2 potok");
//        myThread2.setPriority(Thread.MAX_PRIORITY);
//        System.out.println("Name of myThread3 = " + myThread2.getName());
//        System.out.println("Priority of myThread3 = " + myThread2.getPriority());


                                                             //sleep

        Thread thread1 = new Thread(new MyRunnable1());
        ThreadMethods thread2 = new ThreadMethods();//NEW
        System.out.println(thread1.getState());

        thread1.start();
        System.out.println(thread1.getState());//RUNNABLE
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(thread1.getState());//TERMINATED
        System.out.println("The End");

    }
}

class MyThread3 extends Thread{
    public void run(){
        System.out.println("privet");
    }
}

class MyRunnable1 implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i < 10 ; i++) {
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
