package multithreading;
class s1 extends Thread{
	public void run() {
		try {
			Thread.sleep(3000);
			for(int i=0;i<5;i++) {
				System.out.println(i);
		}   
		}catch(Exception e) {
			System.out.println(e);
		}
}
	}
public class ThreadInterruptMethod {
	public static void main(String[] args) {
		s1 t1 = new s1();
		t1.start();
		t1.interrupt();
		//t1.run();
        for(int i=0;i<5;i++) {
           System.out.println("Main "+i);
        }
		
	}
	



}
