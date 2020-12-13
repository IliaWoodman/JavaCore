package MultiTreadingLessons;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CallableAndFuture1 {
    static int factorialResult;

    // ЗДЕСЬ РЕАЛИЗАЦИЯ ЧЕРЕЗ RUNNABLE

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Factorial factorial = new Factorial(6);
        executorService.execute(factorial);
        executorService.shutdown();
        executorService.awaitTermination(10, TimeUnit.SECONDS);
        System.out.println(factorialResult);

    }
}
class Factorial implements Runnable{

    int f;
    public Factorial(int f){
        this.f = f;
    }
    @Override
    public void run() {
        if (f<=0){
            System.out.println("не вверно число");
            return;
        }
        int result = 1;
        for (int i = 1; i <=f ; i++) {
            result *=i;
        }
        CallableAndFuture1.factorialResult = result;
    }
}
