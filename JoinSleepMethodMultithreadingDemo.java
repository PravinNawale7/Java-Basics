class NaturalThread extends Thread {
    public void run() {
        for (int i = 1; i < 10; i++) {
            System.out.println("Natural Number: " + i);
        }
        System.out.println(Thread.currentThread().getName());
    }
}

class EvenThread extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 10; i += 2) {
                System.out.println("Even Number: " + i);
            }
            System.out.println(Thread.currentThread().getName());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class OddThread extends Thread {
    public void run() {
        try {
            for (int i = 1; i < 10; i += 2) {
                System.out.println("Odd Number: " + i);
                }
            System.out.println(Thread.currentThread().getName());

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class JoinSleepMethodMultithreadingDemo {
    public static void main(String[] args) {
        NaturalThread t1 = new NaturalThread();
        EvenThread t2 = new EvenThread();
        OddThread t3 = new OddThread();

        try {
            t1.start();
            t1.join();  

            Thread.sleep(1000); 
            
            t2.start();
            t2.join();  

            Thread.sleep(1000);  

            t3.start();
            t3.join();  

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
