public class MultiThreading {
    public static void main(String[] args) {
        Multi1 t1 = new Multi1();
        Multi2 t2 = new Multi2();
        Multi3 t3 = new Multi3();
        t1.setPriority(Thread.NORM_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
//       System.out.println(t1.currentThread().getName());
//       System.out.println(t1.getName());
//       System.out.println(t2.getName());
//       t1.setName("Pravin");
//       System.out.println(t1.getName());
//       System.out.println(t2.getPriority());
       
       
        
    }
}