import java.util.*;
class Comma{
          String num="";
          String m="", ns = "";
          void Convert(String an)
          {
                    if(an.length() % 3 == 1)
                    {
                              m = an.substring(0, 1) + ",";
                              an = an.substring(1);
                    }
                    else if(an.length() % 3 == 2)
                    {
                              ns = an.substring(0, 2) + ",";
                              an = an.substring(2);
                    }
                    for(int i=0; i<an.length(); i+=3)
                    {
                              String a = an.substring(i, i+3);
                              num += a + ",";
                    }
                    num = num.substring(0, (num.length() - 1));
                    System.out.println(m+ns+num);
          }
}
public class Number {
          public static void main(String[] args) {
                    Comma c1 = new Comma();
                    Scanner sc = new Scanner(System.in);
                    String n;
                    System.out.println("Input Number");
                    n = sc.nextLine();
                    System.out.println("After Conversion");
                    c1.Convert(n);
                    sc.close();
          }
}