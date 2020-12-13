package MultiTreadingLessons;

public class SynchronizedBlock3 {
    static final Object lock = new Object();// данный объект создается специально для синхронизации по нему
    // конструктор нельза синхронизировать

    void mobileCall() {
        synchronized (lock) {
            System.out.println("Mobile call starts");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Mobile call ends");
        }
    }

    void skypeCall() {
        synchronized (lock) {
            System.out.println("Skype call starts");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Skype call ends");
        }
    }

    void watsAppCall() {
        synchronized (lock) {
            System.out.println("WatsApp call starts");
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("WatsApp call ends");
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunnableImplMobile());
        Thread thread2 = new Thread(new RunnableImplSkype());
        Thread thread3 = new Thread(new RunnableImplWatsApp());
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class RunnableImplMobile implements Runnable {
    @Override
    public void run() {
        new SynchronizedBlock3().mobileCall();
    }
}

class RunnableImplSkype implements Runnable {
    @Override
    public void run() {
        new SynchronizedBlock3().skypeCall();
    }
}

class RunnableImplWatsApp implements Runnable {
    @Override
    public void run() {
        new SynchronizedBlock3().watsAppCall();
    }
}


