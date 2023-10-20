import java.util.Scanner;
class Threads extends Thread {
          String thrd;
          Threads(){
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Name for your Thread");
                    thrd = sc.nextLine();
                    sc.close();
          }
          public void run() {
                    System.out.println("Thread Starts " + thrd);
                    for(int i=0; i<5; i++)
                    {
                              System.out.print(i);
                              try {
                                        Thread.sleep(1000);
                              } catch (Exception e) {
                                        System.out.println("Exception");
                              }
                    }
                    System.out.print(">");
          }
}
public class Multithreads {
          public static void main(String[] args) throws Exception {
                    Threads t1 = new Threads();
                    t1.start();
                    System.out.println(t1.isAlive());
                    t1.join();//Waits for the end of Thread
                    System.out.println("End");
                    System.out.println(t1.isAlive());
          }
}