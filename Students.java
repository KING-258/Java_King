import java.util.*;
class Std{
          String sname;
          int[] marks_array = new int[10];
          int total, avg;
          int x;
          Scanner sc = new Scanner(System.in);
          void assign()
          {
                    int n;
                    System.out.print("Input Name\t");
                    sname = sc.nextLine();
                    System.out.println("Number of Subjects");
                    n = sc.nextInt();
                    x = n;
                    for(int i=0; i<n; i++)
                    {
                              System.out.println("Input Marks in Subject " + (i+1) + " out of 50");
                              marks_array[i] = sc.nextInt();
                    }
          }
          void compute()
          {
                    for(int i=0; i<this.marks_array.length; i++)
                    {
                              total += this.marks_array[i];
                    }
                    avg = total/this.x;
                    System.out.println("Total Marks is " + total);
                    System.out.println("Average of Marks is" + avg);
          }
}
public class Students {
          public static void main(String[] args) {
                    System.out.println("Input Details");
                    Std s1 = new Std();
                    s1.assign();
                    s1.compute();              
          }
}