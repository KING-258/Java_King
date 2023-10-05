import java.util.Scanner;

public class APattern2 {
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Input Highest Number");
                    int s = sc.nextInt();
                    for(int i=1; i<=s; i++)
                    {
                              for(int j=(s-1); j>=i; j--)
                              {
                                        System.out.print(" ");
                              }
                              for(int j=1; j<=i; j++)
                              {
                                        System.out.print(i + " ");
                              }
                              System.out.println();
                    }
                    sc.close();
          }
}
