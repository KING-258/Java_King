import java.util.*;
class Stack{
          int[] arr = new int[10];
          int tos;
          Scanner sc = new Scanner(System.in);
          void Input(){
                    tos = sc.nextInt();
          }
          void push(int a, int b)
          {
                    for(int i=b; i>0; i--)
                    {
                              arr[i] = arr[i-1];
                    }
                    arr[0] = a;
                    if(arr.length>b)
                    {
                              System.out.println("Stack Overflow");
                    }
                    this.Display(b+1);
          }
          void pop(int a, int b)
          {
                    for(int i=0; i<b-1; i++)
                    {
                              if(arr[i] == a)
                              {
                                        int temp = arr[i];
                                        arr[i] = arr[i+1];
                                        arr[i+1] = temp;
                              }
                    }
                    if(arr.length<b)
                    {
                              System.out.println("Stack Underflow");
                    }
                    Display(b-1);
          }
          void Display(int l)
          {
                    for(int i=0; i<l; i++)
                    {
                              System.out.print(arr[i] + "\t");
                    }
          }
}
public class Stacks {         
          public static void main(String[] args) {
                    int a, b, c, d;
                    Stack s1 = new Stack();
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Input Number of Elements for Stack");
                    a = sc.nextInt();
                    System.out.println("Enter Stack Elements");
                    for(int i=0; i<a; i++)
                    {
                              s1.arr[i] = sc.nextInt();
                    }
                    System.out.println("Enter your Choice");
                    System.out.println("Input 1 to push \n 2 to pop \n 3 to display");
                    b = sc.nextInt();
                    if(b == 1)
                    {
                              System.out.println("Element to push");
                              c = sc.nextInt();
                              s1.push(c, a);
                    }
                    else if(b==2)
                    {
                              System.out.println("Element to pop");
                              d = sc.nextInt();
                              s1.pop(d, a);
                    }
                    else if(b == 3)
                    {
                              s1.Display(a);
                    }
                    else
                    {
                              System.out.println("Input a valid choice");
                    }
                    sc.close();
          }
}