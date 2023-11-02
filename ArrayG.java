import java.util.*;
public class ArrayG{
          public static <T> void change(T[] a, int i, int j)throws Exception{
                    T temp;
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                    Display(a);
          }
          static <T> void Display(T[] a){
                    System.out.println();
                    for(int i=0; i<a.length; i++){
                              System.out.print(a[i] + " ");
                    }
          }
          public static <T>void main(String[] args){
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Number of Items for Double Array : ");
                    int x = sc.nextInt();
                    Double[] arr = new Double[x];
                    System.out.println("Elements for Array");
                    for(int i=0; i<x; i++)
                    {
                              arr[i] = sc.nextDouble();
                    }
                    System.out.print("Number of Items for Integer Array : ");
                    int y = sc.nextInt();
                    Integer[] a = new Integer[y];
                    System.out.println("Elements for Array");
                    for(int i=0; i<y; i++)
                    {
                              a[i] = sc.nextInt();
                    }
                    System.out.print("Items for String Array : ");
                    int z = sc.nextInt();
                    String[] ar = new String[z];
                    System.out.println("Strings for Array");
                    for(int i=0; i<z; i++){
                              ar[i] = sc.next();
                    }
                    System.out.print("Items to swap : ");
                    int ac = sc.nextInt();
                    int b = sc.nextInt();
                    ac--;
                    b--;
                    
                    try {
                              change(arr, ac, b);
                              change(a, ac, b);
                              change(ar, ac, b);
                    } catch (Exception e){}
                    sc.close();
          }
}