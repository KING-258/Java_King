import java.util.*;
class NQueen
{
          static int count = 0;
          public static void Queen(int [][]size, String s1, int row)
          {
                    if(row == size.length)
                    {
                              count++;
                              System.out.println(s1 +"\t");
                              return;
                    }
                    for(int i=0; i<size.length; i++)
                    {
                              int m = 1;
                              for(int l = row - 1, j = i; l>=0; l--)
                              {
                                        if(size [l][j] == 1)
                                        {
                                                  m = 0;
                                        }
                              }
                              for(int l = row-1, j = i-1; l>=0 && j>=0; l--,j--)
                              {
                                        if(size[l][j] == 1)
                                        {
                                                  m = 0;
                                        }
                              }
                              for(int l = row - 1,j = i+1; l>=0 && j<size.length; l--,j++)
                              {
                                        if(size[l][j] == 1)
                                        {
                                                  m = 0;
                                        }
                              }
                              if(m == 1)
                              {
                                        size[row][i] = 1;
                                        s1 = s1 + row + "-" + i;
                                        Queen(size, s1 , row+1);
                                        size[row][i] = 0;
                              }
                    }
          }
          public static void main(String[] args) {
                    int n;
                    System.out.println("Input N");
                    Scanner sc = new Scanner(System.in);
                    n = sc.nextInt();
                    int [][] a = new int[n][n];
                    Queen(a, "", 0);
                    sc.close();
                    System.out.println(count + " Number of Solutions");
          }
}