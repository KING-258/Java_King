class Table extends Thread{
          int n;
          Table(int a)
          {
                    n = a;
          }
          public void run(){
                    int a = n;
                    System.out.println("Table of "+n);
                    for(int i=1;i<=10;i++)
                    {
                              a = n*i;
                              System.out.println(n+"x"+i+"="+a);
                              try {
                                        Thread.sleep(500);
                              } catch (Exception e) {
                                        System.out.println("Never Executed");
                              }
                    }
          }
}
public class MultiplicationTable {
          public static void main(String[] args) throws Exception{
                    Table t1 = new Table(5);
                    t1.start();
                    t1.join();
                    Table t2 = new Table(7);
                    t2.start();
          }
}