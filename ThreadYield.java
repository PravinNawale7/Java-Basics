class Simp extends Thread {
    public void run() {
    	Thread.yield();
        for (int i = 0; i < 5; i++) {
            System.out.println("Simple Thread: " + i);
        }
    }
}

public class ThreadYield {
    public static void main(String[] args) {
        Simp t1 = new Simp();
        t1.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("Main " + i);
        }
        
    }
}
