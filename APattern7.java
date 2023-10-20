import java.util.Scanner;
public class APattern7 {
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Number of Lines for Square : ");
                    int n = sc.nextInt();
                    for(int i=1; i<=n; i++)
                    {
                              for(int j=1 ; j<=n; j++)
                              {
                                        if(i==1 || j==1 || i+j==n+1 || i==j || i==n || j==n)
                                        {
                                                  System.out.print("*");
                                        }
                                        else{
                                                  System.out.print(" ");
                                        }
                              }
                              System.out.println();
                    }
                    sc.close();
          }
}
