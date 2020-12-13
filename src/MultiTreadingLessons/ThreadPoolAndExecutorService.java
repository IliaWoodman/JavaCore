package MultiTreadingLessons;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolAndExecutorService {
    // Thread pool - это множество потоков, каждый из которых предназначен для выполнения той или иной задачи
    // В Java с thread pool-ами удобнее всего работать посредством ExecutorService
    public static void main(String[] args) throws InterruptedException {
        // Thread pool удобнее всего создавать, используя factory методы класса Executors
        //Executors.newFixedThreadPool(int count) - создаст пул с несколькими потоками
        //Executors.newSingleThreadExecutor() - создаст пул с одним потоком

        // Метод execute передает наше задание в thread pool, где оно выполняется одним из потоков
        // После выполнения метода shutdown ExecutorService понимает, что новых заданий не будет
        // и после выполнения уже поступивших заданий прекращает работу

//        ExecutorService executorService = Executors.newFixedThreadPool(5);
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        for (int i = 0; i < 10; i++) {
            executorService.execute(new RunnableImpl10());
        }
        executorService.shutdown(); // закрыть потоки
        executorService.awaitTermination(5, TimeUnit.SECONDS); // аналог wait или join
        System.out.println("main ends");
    }
}

class RunnableImpl10 implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
