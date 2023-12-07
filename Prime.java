import java.util.*;
public class Prime {
    static int isPrime(int a){
        int flag = 0;
        if(a == 1 || a == 2){
            flag = 1;
            return flag;
        }
        else{
            for(int i=2; i<a; i++){
                if(a % i == 0){
                    flag = 0;
                    break;
                }
                else{
                    flag = 1;
                }
            }
            return flag;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numbers to Generate : ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        int index = 0;
        int num = 1;
        do{
            if(isPrime(num) == 1){
                arr[index] = num;
                index++;
            }
            num++;
        }while(index != a);
        System.out.println("Array of Primes");
        for(int i=0; i<a; i++){
            System.out.print(arr[i] + "\t");
        }
        sc.close();
    }
}