import java.util.*;
public class APattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Number of Stars");
        int s = sc.nextInt();
        for (int i = s; i >= 1; i--) {
            for (int j = (i - 1); j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < s; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}