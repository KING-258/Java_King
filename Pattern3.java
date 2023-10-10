import java.util.*;
public class Pattern3 {
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Input Number of Lines");
                    int s = sc.nextInt();
                    int m = 0;
                    for(int i=1; i<=s; i++)
                    {
                              m=1;
                              for(int j=s; j>=i; j--)
                              {
                                        System.out.print(m + " ");
                                        m++;
                              }
                              System.out.println();
                    }
                    sc.close();
          }
}