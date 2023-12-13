class myThread implements Runnable{
    public void run(){
        System.out.println("Start");
        try{
            Thread.sleep(500);
        }catch(Exception e){}
    }  
}
public class ThreadTest {
    public static void main(String[] args) {
        myThread mt = new myThread();
        Thread t1 = new Thread(mt);
        t1.start();
    }
}