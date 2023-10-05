import java.util.Scanner;

public class ArrayP {
          public static void main(String[] args)
          {
                    int a;
                    int flag = 1;
                    System.out.println("Input Array Size");
                    Scanner sc = new Scanner(System.in);
                    a = sc.nextInt();
                    int[] arr = new int[a];
                    System.out.println("Input Elements of the Array");
                    for(int i=0; i<a; i++)
                    {
                              arr[i] = sc.nextInt();         
                    }
                    for(int i=0; i<a; i++)
                    {
                              for(int j=2; j<arr[i]; j++)
                              {         
                                        flag = 1;
                                        if(arr[i]%j == 0)
                                        {
                                                  flag = 0;
                                                  break;
                                        }
                              }
                              if(flag == 1)
                              {
                                        System.out.println(arr[i] + " is prime");
                              } 
                              else
                              {
                                        System.out.println(arr[i] + " is not prime");
                              }
                    }
                    sc.close();
          }
}
