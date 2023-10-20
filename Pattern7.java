import java.util.*;
public class Pattern7 {
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Length for the side : ");
                    int n = sc.nextInt();
                    if(n%2==1)
                    {
                              n++;
                    }
                    for(int i=1; i<n; i++)
                    {
                              for(int j=1; j<=n; j++)
                              {
                                        if(i == n/2)
                                        {
                                                  System.out.print("*");
                                        }
                                        else if(i+n/2 == j){
                                                  System.out.print("*");
                                        }
                                        else if(i+j == (n+n/2))
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