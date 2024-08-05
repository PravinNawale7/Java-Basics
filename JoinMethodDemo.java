class ThreadClass1 extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(i);
		}
		System.out.println("Thread Name: "+Thread.currentThread().getName());
	}
}
public class JoinMethodDemo {

	public static void main(String[] args) {
	  ThreadClass1 t1 = new ThreadClass1();
	  t1.start();
	  try {
		 t1.join();
		  for(int i=0;i<5;i++) {
			  System.out.println(i);
		  }
		  System.out.println("Thread Name: "+Thread.currentThread().getName());
	  }catch(Exception e) {
		  System.out.println(e);
	  }
	  
	}

}
