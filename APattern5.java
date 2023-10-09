import java.util.*;
public class APattern5{
          public static void main(String[] args) {
                    System.out.println("Number of Rows");
                    Scanner sc = new Scanner(System.in);
                    int a = sc.nextInt();
                    int m=a;
                    int sum=0;
                    while(m!=0)
                    {
                              sum+=m;
                              m--;
                    }
                    for(int i=a; i>=1; i--)
                    {
                              for(int j=i; j>=1; j--)
                              {
                                        System.out.print(sum+" ");
                                        sum--;
                              }
                              System.out.println();
                    }
                    sc.close();
          }
}