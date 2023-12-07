class Threads extends Thread {
    String thrd;
    int c;

    Threads(String s, int t) {
        thrd = s;
        c = t;
    }

    public void run() {
        for (int i = 0; i < 5; i += 2) {
            System.out.println((c + i) + " is " + thrd);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}

public class ThreadFuncs {
    public static void main(String[] args) throws Exception {
        Threads t1 = new Threads("Odd", 1);
        Threads t2 = new Threads("Even", 2);
        t1.start();
        Thread.sleep(500);
        t2.start();
        t1.join();
        t2.join();
    }
}