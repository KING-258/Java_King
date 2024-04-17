import java.util.*;
public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Length for Square : ");
        int a = sc.nextInt();
        for(int i=0; i<=a; i++){
            for(int j=0; j<=a; j++){
                if(i == 0 || j == 0 || i == a || j == a || i == j || i+j == a){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}