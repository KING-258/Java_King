import java.util.*;
class St{
          String name[];
          String extractinitials(String s)
          {
                    String in = "";
                    String name[] = s.split(" ");
                    for(int i=0; i<name.length; i++)
                    {
                              in += name[i].substring(0, 1);
                    }
                    in = in.toUpperCase();
                    return in;
          }
          void RemoveBlankSpace(String s)
          {
                    String sn = "";
                    String name[] = s.split(" ");
                    for(int i=0; i<name.length; i++)
                    {
                              sn += name[i];
                    }
                    System.out.println("Name without Spaces is "+sn);
          }
}
public class STUDENT {
          public static void main(String[] args) {
                    St s1 = new St();
                    Scanner sc = new Scanner(System.in);
                    String n = "";
                    System.out.println("Input Name");
                    n = sc.nextLine();
                    String a = s1.extractinitials(n);
                    System.out.println("Initials of " + n + " are " + a);
                    s1.RemoveBlankSpace(n);
                    sc.close();
          }
}