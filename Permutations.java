import java.util.*;
class Permutations {
    static int m = 0;
    public static void Permutation(String str, String s1, int s) {
        if (str.length() == 0) {
            m++;
            System.out.println(s1 + "\t" + m);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char first = str.charAt(i);
            String newstr = str.substring(0, i) + str.substring(i + 1);
            Permutation(newstr, s1 + first, s + 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input");
        String str = sc.nextLine();
        sc.close();
        Permutation(str, "", 0);
    }
}