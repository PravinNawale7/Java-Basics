class Simple extends Thread {
    public void run() {
    	for(int i=0;i<5;i++) {
            System.out.println("Normal Thread "+i);	
    	}
    }
}

public class ThreadSleep {
    public static void main(String[] args) {
        Simple t1 = new Simple();
        t1.start();
        try {
        	for(int i=0;i<5;i++) {
                System.out.println("Main thread "+i);
                Thread.sleep(1000);
        	}
        } catch (Exception e) {
        	System.out.println(e);
        }

    }
}
