import java.util.*;
public class Array1 {
          public static void main(String[] args)
          {
                    int a = 0;
                    System.out.println("Input Nth Element in the Array");
                    Scanner sc = new Scanner(System.in);
                    a = sc.nextInt();
                    int[] arr = new int[a+1];
                    for(int i=0; i<=a; i++)
                    {
                              arr[i] = i;
                    }
                    for(int x : arr)
                    {
                              System.out.print(x + "  ");
                    }
                    sc.close();
          }
}
