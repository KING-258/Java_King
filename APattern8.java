import java.util.*;
public class APattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Length : ");
        int a = sc.nextInt();
        System.out.print("Input Width : ");
        int b = sc.nextInt();
        for(int i=0; i<=a; i++){
            for(int j=0; j<=b; j++){
                if(i==b/2){
                    System.out.print("*");
                }
                else if(j == a/2){
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