package MultiTreadingLessons;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPoolAndScheduledExecutorService {
    //ScheduledExecutorService мы используем тогда, когда хотим установить расписание на запуск потоков из пула
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService service = Executors.newScheduledThreadPool(1);


//        for (int i = 0; i < 10; i++) {
//            service.execute(new RunnableImpl11());
//        }

//
//        service.schedule(new RunnableImpl11(), 3, TimeUnit.SECONDS);
//        service.shutdown();

//        service.scheduleAtFixedRate(new RunnableImpl11(), 3, 1, TimeUnit.SECONDS);
//        Thread.sleep(10000);
//        service.shutdown();
// здесь выполнение таска начинается через 3 секунды, а 1 секунда это время между началом выполнения первого таска и началом второго

        service.scheduleWithFixedDelay(new RunnableImpl11(), 3, 1, TimeUnit.SECONDS);
//        Thread.sleep(10000);
//        service.shutdown();
// здесь выполнение таска начинается через 3 секунды, а 1 секунда это время между концом выполнения первого таска и началом второго


        ExecutorService executorService = Executors.newCachedThreadPool();

    }
}

class RunnableImpl11 implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " begins work");
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println(Thread.currentThread().getName() + " ends work");

    }
}
