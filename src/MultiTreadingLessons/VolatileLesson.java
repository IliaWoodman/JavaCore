package MultiTreadingLessons;

public class VolatileLesson extends Thread{
    // Ключевое слово volatile используеется для пометки переменной, как хранящейся только в основной памяти

    // Для синхронизации значения переменной между потоками ключевое слово volatile используется тогда, когда только один
    // поток может изменять значение этой переменной, а остальные потоки могут только читать его
    volatile boolean b = true;
    public void run(){
        long counter = 0;
        while (b){
            counter++;
        }
        System.out.println("Loop is finished. Counter = " + counter);
    }
    public static void main(String[] args) throws InterruptedException {
        VolatileLesson thread = new VolatileLesson();
        thread.start();
        Thread.sleep(3000);
        System.out.println("After 3 sec");
        thread.b = false;
        thread.join();
        System.out.println("End programm");
    }

}
