class Multi2 extends Thread {
    public void run() {
        for (int i = 2; i < 10; i+=2) {
                System.out.println("Even No: " + i);
        }
    }
}


