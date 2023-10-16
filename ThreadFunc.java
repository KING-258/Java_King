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
                              System.out.print("-");
                              try {
                                        Thread.sleep(1000);
                              } catch (Exception e) {
                                        System.out.println("Exception");
                              }
                    }
                    System.out.print(">");
          }
}
public class ThreadFunc{
          public static void main(String[] args) throws Exception {
                    Threads t1 = new Threads();
                    System.out.println("Name of the Thread by Default : " + t1.getName());
                    t1.start();
                    t1.join();
                    System.out.println("End");
                    t1.setName(t1.thrd);//Parameter type String
                    System.out.println("Name of the Thread by User : " + t1.getName());//return type String 
                    System.out.println("Priority by Defau;t of the thread : " + t1.getPriority());//1 is min priority and 10 is max priority
          }
}