class Goods{
    int num;
    int avail = 0;
    public synchronized void put(int a){
        while (avail == 1){
            try {
                wait();
            }catch(Exception e){}
        }
        System.out.println("Put : " + a);
        num = a;
        avail = 1;
        notify();
    }
    public synchronized void get(){
        while (avail == 0){
            try {
                wait();
            } catch(Exception e){}
        }
        System.out.println("Get : " + num);
        avail = 0;
        notify();
    }
}
class Producer extends Thread{
    Goods g1;
    Producer(Goods g){
        g1 = g;
        Thread t = new Thread(this);
        t.start();
    }
    public void run(){
        int a = 0;
        while(true){
            g1.put(a++);
            try {
                Thread.sleep(2000);   
            }catch(Exception e){}
        }
    }
}
class Consumer extends Thread{
    Goods g1;
    Consumer(Goods g){
        g1 = g;
        Thread t = new Thread(this);
        t.start();
    }
    public void run(){
        while(true){
            g1.get();
            try {
                Thread.sleep(2000);   
            }catch(Exception e){}
        }
    }
}
public class ProducerConsumer {
    public static void main(String[] args) {
        Goods g = new Goods();
        new Producer(g);
        new Consumer(g);
    }
}