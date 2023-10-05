import java.util.*;
class Employee{
          String ename;
          int eid;
          double basic;
          double da = 0.52*basic;
          double gross_sal = basic + da;
          double net_sal;
          Scanner sc = new Scanner(System.in);
          void read()
          {
                    System.out.print("Employee Name\t");
                    ename = sc.nextLine();
                    System.out.print("Employee ID\t");
                    eid = sc.nextInt();
                    System.out.print("Employee Basic Salary\t");
                    basic = sc.nextDouble();
                    da = 0.52*basic;
                    gross_sal = basic + da;
          }
          void compute_net_salary()
          {
                    da = 0.52*basic;
                    gross_sal = basic + da;
                    net_sal = gross_sal - (0.3 * gross_sal);
          }
          void display()
          {
                    System.out.println("Employee Details");
                    System.out.println("Employee Name : " + ename);
                    System.out.println("Employee ID : " + eid);
                    System.out.println("Employee Basic : " + basic);
                    System.out.println("Employee Net Salary : " + net_sal);
                    System.out.println("Employee Gross Salary : " + gross_sal);
          }
}
public class Employees {
          public static void main(String[] args) {
                    int a;
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Input Number of Employees\t");
                    a = sc.nextInt();
                    Employee[] e1 = new Employee[a];
                    for(int i=0; i<a; i++)
                    {
                              System.out.println("Employee " + (i+1));
                              e1[i] = new Employee();
                              e1[i].read();
                              e1[i].compute_net_salary();
                    }
                    for(int i=0; i<a; i++)
                    {
                              e1[i].display();
                    }
                    sc.close();
          }
}