import java.util.*;
public class Pattern {
          public static void main(String[] args) {
                    System.out.println("Input Number of Lines");
                    Scanner sc = new Scanner(System.in);
                    int s = sc.nextInt();
                    for(int i=1; i<=s; i++)
                    {
                              for(int j=i; j>0; j--)
                              {
                                        System.out.print('*');
                              }
                              System.out.println();
                    }
                    sc.close();
          }
}