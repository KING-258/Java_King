class Threads extends Thread {
          String thrd;
          Threads(String name) {
                    thrd = name;
          }
          public void run() {
                    System.out.println("Thread Starts " + thrd);
                    for(int i=0; i<4; i++)
                    {
                              System.out.print("-");
                              try {
                                        Thread.sleep(1000);//Sleep is always used with try and catch
                              } catch (Exception e) {
                                        System.out.println("Exception");
                              }
                    }
                    System.out.print(">");
          }
}
public class Multithreading {
          public static void main(String[] args) throws Exception {
                    Threads t1 = new Threads("Thread 1");
                    t1.start();
                    System.out.println();
          }
}