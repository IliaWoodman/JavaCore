package MultiTreadingLessons;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueLesson {
    // ArrayBlockingQueue - потокобезопасная очередь с ограниченным размером (capacity restricted)
    // Обычно один или несколько потоков добавляют элементы в конец очереди, а другой или другие потоки забирают элементы из начала очереди

    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(4);

        // Producer
        new Thread(()->{
            int i = 0;
            while (true){
                try {
                    queue.put(++i);
                    System.out.println("Producer dobavil: " + i);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();


        // Consumer
        new Thread(() -> {
            while (true){
                try {
                    Integer j = queue.take();
                    System.out.println("Consumer zabral: " + j);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
