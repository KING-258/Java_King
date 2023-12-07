import java.util.*;
public class Factorial{
    static int fact(int a){
        int f;
        f = 1;
        for(int i=1; i<=a; i++){
            f = f*i;
        }
        return f;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input N : ");
        int n = sc.nextInt();
        System.out.print("Input R : ");
        int r = sc.nextInt();
        System.out.println("NCR is : " + (fact(n) / (fact(r) * fact(n-r))));
        sc.close();
    }
}