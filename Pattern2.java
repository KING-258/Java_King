import java.util.*;
public class Pattern2 {
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Input Number of Lines");
                    int s = sc.nextInt();
                    for(int i=1; i<=s; i++)
                    {
                              for(int j=1; j<=i; j++)
                              {
                                        System.out.print(j);
                              }
                              System.out.println();
                    }
                    sc.close();
          }
}