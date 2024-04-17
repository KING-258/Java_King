import java.util.*;
public class APattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of Stars for Square : ");
        int a = sc.nextInt();
        for(int i=0; i<=a; i++){
            for(int j=0; j<=a; j++){
                if(i == 0 || i == a){
                    System.out.print("*");
                }
                else if(j == 0 || j == a){
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