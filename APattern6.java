import java.util.*;
public class APattern6 {
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Number of Stars : ");
                    int n = sc.nextInt();
                    for (int i=1; i<=n; i++) {
                              for (int j=1; j<=n-i+1; j++) {
                                        System.out.print("*");
                              }
                              int sp = 2*(i-1);
                              for(int j=1; j<=sp; j++)
                              {
                                        System.out.print(" ");
                              }
                              for(int j=n-i+1; j>=1; j--)
                              {
                                        System.out.print("*");
                              }
                              System.out.println();
                    }
                    for (int i=n; i>=1; i--)
                    {
                              for (int j=1; j<=n-i+1; j++) {
                                        System.out.print("*");
                              }
                              int sp = 2*(i-1);
                              for(int j=1; j<=sp; j++)
                              {
                                        System.out.print(" ");
                              }
                              for(int j=n-i+1; j>=1; j--)
                              {
                                        System.out.print("*");
                              }
                              System.out.println();
                    }
                    sc.close();
          }
}