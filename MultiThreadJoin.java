class JoinExample extends Thread {
    public void run() {
        for(int i = 1; i <= 3; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        JoinExample t1 = new JoinExample();
        JoinExample t2 = new JoinExample();

        t1.start();
        t1.join();   // wait till t1 finishes
        t2.start();
    }
}
