import java.util.*;
public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of Elements for Array : ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        for(int i=0; i<a; i++){
            System.out.print("Element at " + (i+1) + " : ");
            arr[i] = sc.nextInt();
        }
        int sum=0;
        for(int i : arr){
            sum += arr[i-1];
        }
        System.out.println("Sum of All Elements in the Array : " + sum);
        sc.close();
    }
}
