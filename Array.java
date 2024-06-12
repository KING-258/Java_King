import java.util.*;

public class Array {
    public static void main(String[] args) {
        int a, temp = 0;
        int[] arr = new int[80];
        System.out.println("Input Size of Array");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        System.out.println("Input Array");
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < a / 2; i++) {
            temp = arr[i];
            arr[i] = arr[a - i - 1];
            arr[a - i - 1] = temp;
        }
        System.out.println("Reversed Array is");
        for (int i = 0; i < a; i++) {
            System.out.print(arr[i] + "   ");
        }
        sc.close();
    }
}
