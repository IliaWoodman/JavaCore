package MultiTreadingLessons;

import java.util.concurrent.*;

public class CallableAndFuture2 {
    // Callable так же как и Runnable, представляет собой определенное задание, которое выполняется потоком
    // В отличии от Runnable, Callable имеет return type а не void
    // может выбрасывать Exception
    // Метод submit передает наше задание (task) в thread pool, для выполнения его одним из потоков,
    // и возвращает тип Future, в котором и хранится результат выполнения нашего задания
    static int factorialRes;

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Factorial2 factorial2 = new Factorial2(7);
        Future<Integer> future = executorService.submit(factorial2);
        try {
            System.out.println("hotim poluchit result");
            factorialRes = future.get();
            System.out.println("poluchili result");
        } catch (ExecutionException e) {
            System.out.println(e.getCause());
        }
        finally {
            executorService.shutdown();
        }
        System.out.println(factorialRes);
    }
}

class Factorial2 implements Callable<Integer> {
    int f;

    public Factorial2(int f) {
        this.f = f;
    }

    @Override
    public Integer call() throws Exception {
        if (f <= 0) {
            throw new Exception("inncorect number");
        }
        int res = 1;
        for (int i = 1; i <= f; i++) {
            res *= i;
        }
        return res;
    }
}
