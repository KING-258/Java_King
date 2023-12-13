import java.util.*;
public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input String : ");
        String s = sc.nextLine();
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase());
        System.out.print("Input Another String : ");
        String t = sc.nextLine();
        System.out.println(s.toUpperCase().compareTo(t.toUpperCase()));//Returns difference in ASCII Values at the point of change
        System.out.println(s.toLowerCase().equals(t.toLowerCase()));//Return boolean values
        System.out.print("Input Integer : ");
        int x = sc.nextInt();
        System.out.println(Integer.toString(x).toUpperCase());
        sc.close();
    }
}