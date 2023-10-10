import java.util.*;

public class APattern4 {
          public static void Star(int a) {
                    if (a == 1) {
                              System.out.print("*");
                    } else {
                              int temp = a;
                              while (temp > 1) {
                                        System.out.print("*");
                                        temp--;
                              }
                              while (temp <= a) {
                                        System.out.print("*");
                                        temp++;
                              }
                    }
          }

          public static void main(String[] args) {
                    System.out.println("Number of Lines");
                    Scanner sc = new Scanner(System.in);
                    int a = sc.nextInt();
                    int m = a / 2;
                    for (int i = 1; i <= m; i++) {
                              for (int j = (m - 1); j >= i; j--) {
                                        System.out.print(" ");
                              }
                              Star(i);
                              System.out.println();
                    }
                    for (int i = m; i >= 1; i--) {
                              for (int j = (m - 1); j >= i; j--) {
                                        System.out.print(" ");
                              }
                              Star(i);
                              System.out.println();
                    }
                    sc.close();
          }
}