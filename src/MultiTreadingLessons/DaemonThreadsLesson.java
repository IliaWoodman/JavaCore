package MultiTreadingLessons;

public class DaemonThreadsLesson {
    // Daemon потоки предназначены для выполнения фоновых задач и оказания различных сервесов User потокам

    // При завершении работы последнего User потока программа завершает свое выполнение. не доидаясь окончания Daemon потока

    public static void main(String[] args) {
        System.out.println("Main thread starts");
        UserThread userThread = new UserThread();
        userThread.setName("user_thread");
        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setName("daemon_thread");
        daemonThread.setDaemon(true);

        userThread.start();
        daemonThread.start();
        System.out.println("Main thread ends");

        // Программа закончится как только поток User выведет буквы от A до I
        // не смотря на то что поток Daemon не вывел значения до 1000
    }
}

class UserThread extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is daemon: " + isDaemon());

        for (char i = 'A'; i < 'J'; i++) {
            try {
                sleep(300);
                System.out.println(i);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

class DaemonThread extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is daemon: " + isDaemon());

        for (int i = 1; i <= 1000; i++) {
            try {
                sleep(100);
                System.out.println(i);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
