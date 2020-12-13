package MultiTreadingLessons;

public class InterruptionLesson {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main starts");
        InterruptedThread thread = new InterruptedThread();
        thread.start();
        Thread.sleep(2000);
        thread.interrupt();
        thread.join();
        System.out.println("Main ends");
    }
}

class InterruptedThread extends Thread{
    double sqrtSum = 0;
    @Override
    public void run() {
        for (int i = 1; i < 1000000000; i++) {
            if (isInterrupted()){
                System.out.println("Поток хотят прервать");
                return;
            }
            sqrtSum+=Math.sqrt(i);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Поток хотят прервать во время сна. Давайте завершим его работу");
                System.out.println(sqrtSum);

                return;
            }
        }
        System.out.println(sqrtSum);
    }
}
