package multithreading;

class Printing {
    synchronized void print(char c) {
        for (int i = 1; i < 3; i++) {
            for (int j = 1; j < 3; j++) {  
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
class A extends Thread {
    Printing p;
    A(Printing p) {
        this.p = p;
    }
    public void run() {
        p.print('*');
    }
}

class B extends Thread {
    Printing p;
    B(Printing p) {
        this.p = p;
    }
    public void run() {
        p.print('#');
    }
}

public class Synchronization {
    public static void main(String[] args) {
        Printing aa = new Printing();
        A threadA = new A(aa);
        B threadB = new B(aa);
        threadA.start();
        threadB.start();
    }
}
