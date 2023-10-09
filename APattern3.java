import java.util.*;
public class APattern3{
          public static void PrintPalin(int a)
          {
                    if(a == 1)
                    {
                              System.out.print(a);
                    }
                    else{
                              int temp = a;
                              while(a > 1)
                              {
                                        System.out.print(a);
                                        a--;
                              }
                              while(a <= temp)
                              {
                                        System.out.print(a);
                                        a++;
                              }
                    }
          }
          public static void main(String[] args)
          {
                    System.out.println("Number of Rows");
                    Scanner sc = new Scanner(System.in);
                    int a = sc.nextInt();
                    for(int i=1; i<=a; i++)
                    {
                              for(int j=(a-1); j>=i; j--)
                              {
                                        System.out.print(" ");
                              }
                              PrintPalin(i);
                              System.out.println();
                    }
                    sc.close();
          }
}