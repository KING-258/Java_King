import java.util.*;

public class Pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Height for Pyramid : ");
        int a = sc.nextInt();
        int m = 1;
        for (int i = a; i >= 1; i--) {
            for (int j = 1; j < m; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (k == 1 || k == 2 * i - 1 || i == a){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            m++;
            System.out.println();
        }
        sc.close();
    }
}