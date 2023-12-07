import java.util.*;
public class SumofDigits {
    static int Sum(int a){
        int sum = 0;
        while(a != 0){
            sum += a % 10;
            a /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Number : ");
        int a = sc.nextInt();
        System.out.println("Sum of Digits of " + a + " : " + Sum(a));
        sc.close();
    }
}
