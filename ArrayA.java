import java.util.Scanner;

public class ArrayA {
          public static void main(String[] args)
          {
                    int a, b;
                    int r, c;
                    System.out.println("Input Size of Matrix 1 R & C");
                    Scanner sc = new Scanner(System.in);
                    a = sc.nextInt();
                    b = sc.nextInt();
                    System.out.println("Input Size of Matrix 2 R & C");
                    r = sc.nextInt();
                    c = sc.nextInt();
                    int[][] mat1 = new int[a][b];
                    System.out.println("Input Array 1 Elements");
                    for(int i=0; i<a; i++)
                    {
                              for(int j=0; j<b; j++)
                              {
                                        mat1[i][j] = sc.nextInt();
                              }
                    }
                    int [][] mat2 = new int[r][c];
                    System.out.println("Input Array 2 Elements");
                    for(int i=0; i<r; i++)
                    {
                              for(int j=0; j<c; j++)
                              {
                                        mat2[i][j] = sc.nextInt();
                              }
                    }
                    int [][] res = new int[a][b];
                    System.out.println("Sum of Matrices is ");
                    for(int i=0; i<a; i++)
                    {
                              for(int j=0; j<b; j++)
                              {
                                        res[i][j] = mat1[i][j] + mat2[i][j];
                                        System.out.print(res[i][j] + "\t");
                              }
                              System.out.println();
                    }
                    sc.close();
          }
}
