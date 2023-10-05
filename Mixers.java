import java.util.*;
class Mixer{
          int[] arr;
          Scanner sc = new Scanner(System.in);
          void accept()
          {
                    int n, num;
                    int prev = 0;
                    System.out.print("Input Number of Elements");
                    n = sc.nextInt();
                    arr = new int[n];
                    System.out.println("Elements of Array");
                    for(int i=0; i<n; i++)
                    {
                              num = sc.nextInt();
                              if(prev < num)
                              {
                                        arr[i] = num;
                              }
                              else
                              {
                                        System.out.println("Try again");
                                        i--;
                              }
                              prev = num;
                    }
          }
          Mixer Mix(Mixer A)
          { 
                    Mixer m = new Mixer();
                    m.arr = new int[this.arr.length + A.arr.length];
                    for(int i=0; i<A.arr.length; i++)
                    {
                              m.arr[i] = A.arr[i];
                    }
                    for(int i=0; i<this.arr.length; i++)
                    {
                              m.arr[A.arr.length + i] = this.arr[i];
                    }
                    return m;
          }
          void Display()
          {
                    System.out.println("Merged and Sorted Array is");
                    for(int i=0; i<arr.length; i++)
                    {
                              for(int j=i; j<arr.length; j++)
                              {
                                        if(arr[i]>arr[j])
                                        {
                                                  int temp = arr[i];
                                                  arr[i] = arr[j];
                                                  arr[j] = temp;
                                        }
                              }
                    }
                    for(int i=0; i<arr.length; i++)
                    {
                              System.out.print(arr[i]+"\t");
                    }
          }
}
public class Mixers {
          public static void main(String[] args) {
                    Mixer m1 = new Mixer();
                    Mixer m2 = new Mixer();
                    m1.accept();
                    m2.accept();
                    Mixer m3 = m1.Mix(m2);
                    m3.Display();
          }
}