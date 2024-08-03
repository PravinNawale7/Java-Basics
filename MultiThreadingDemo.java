class Thread1 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            if (i == 2) {
                Thread.yield();
            }
            System.out.println("Natural No A:" + i);
        }
        System.out.println("End of thread A");
        System.out.println("----------------------");
    }
}

class Thread2 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                stop();
            }
            System.out.println("Natural No B:" + i);
        }
        System.out.println("End of thread B");
        System.out.println("----------------------");
    }
}

public class MultiThreadingDemo {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Natural No Main Thread:" + i);
                Thread.sleep(2000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
