import java.util.*;
class Employe{
          String name[];
          String mail;
          String email = "@learner.manipal.edu";
          void FormatEmployeeName(String str) {
                    String name[] = str.split(" ");
                    for(int i=0; i<name.length; i++) {

                              String w = name[i].substring(0, 1);
                              w = w.toUpperCase();
                              String left = name[i].substring(1);
                              left = left.toLowerCase();
                              name[i] = w + left;
                    }
                    System.out.println("Name Formatted");
                    for(int i=0; i<name.length; i++)
                    {
                              System.out.print(name[i] + " ");
                    }
                    System.out.println();
          }
          void MailID(String str)
          {
                    String s = "";
                    String name[] = str.split(" ");
                    s = name[0].substring(0, 1);
                    for(int i=1; i<name.length; i++)
                    {
                              s += name[i];
                    }
                    str = s.toLowerCase();
                    mail = str + email;
                    System.out.println("Mail alloted is " + mail);
          }
}
public class EmployeeMail {
          public static void main(String[] args) {
                    Employe e1 = new Employe();
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Input Employee Name : ");
                    String n = sc.nextLine();
                    e1.FormatEmployeeName(n);
                    e1.MailID(n);
                    sc.close();
          }
}