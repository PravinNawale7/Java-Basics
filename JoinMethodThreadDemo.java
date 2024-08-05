class DemoThread extends Thread {
    public void run() {
    	System.out.println("Local Thread: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        System.out.println("===============================");
        
    }
}
public class JoinMethodThreadDemo {

    public static void main(String[] args) {
        DemoThread t1 = new DemoThread();
        try {
        	System.out.println("Main Thread: ");
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
            }
            System.out.println("=================================");
            t1.start();
            t1.join();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
