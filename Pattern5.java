import java.util.Scanner;

public class Pattern5 {
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Input Number of Lines");
                    int s = sc.nextInt();
                    for(int i=1; i<=s; i++)
                    {
                              for(int j=1; j<=i; j++)
                              {
                                        if((i+j) % 2 == 0)
                                        {
                                                  System.out.print("1");
                                        }
                                        else{
                                                  System.out.print("0");
                                        }
                              }
                              System.out.println();
                    }
                    sc.close();
          }
}