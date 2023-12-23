import java.util.*;
public class LinkedListDemo {
    Node head = null;
    class Node{
        String data;
        Node next;
        Node(String a){
            this.data = a;
            this.next = null;
        }
    }
    public void AddB(String a){
        Node newNode = new Node(a);
        if(head == null){
            head = newNode;
            return;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }
    public void AddE(String a){
        Node newNode = new Node(a);
        if(head == null){
            head = newNode;
            return;
        }
        else{
            Node curr = head;
            while(curr.next != null){
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }
    public String RemoveB(){
        if(head == null){
            System.out.print("Nothing to Remove\n");
            return "";
        }
        else{
            String a = head.data;
            head = head.next;
            return a;
        }
    }
    public String RemoveE(){
        if(head == null){
            System.out.print("Nothing to Remove\n");
            return "";
        }
        else{
            Node curr = head;
            while(curr.next.next != null){
                curr = curr.next;
            }
            String a = curr.next.data;
            curr.next = null;
            return a;
        }
    }
    public void Display(){
        if(head == null){
            System.out.println("Nothing in LL");
        }
        else{
            Node curr = head;
            while(curr != null){
                System.out.print(curr.data + " ");
                curr = curr.next;
            }
            System.out.print("NULL");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedListDemo l1 = new LinkedListDemo();
        int ch = 0;
        System.out.println("Menu\n1.AddBeginning()\n2.AddEnd()\n3.RemoveBeginning()\n4.RemoveEnd()\n5.Display()\n6.Exit()\n");
        do{
            System.out.print("Input Choice : ");
            ch = sc.nextInt();
            if(ch == 1){
                System.out.print("String to add : ");
                String s = sc.next();
                l1.AddB(s);
            }
            else if(ch == 2){
                System.out.print("String to add : ");
                String s = sc.next();
                l1.AddB(s);
            }
            else if(ch == 3){
                String s = l1.RemoveB();
                System.out.println(s + " was Removed from LL");
            }
            else if(ch == 4){
                String s = l1.RemoveE();
                System.out.println(s + " was Removed from LL");
            }
            else if(ch == 5){
                l1.Display();
            }
            else if(ch == 6){
                System.out.println("***EXIT***");
            }
            else{
                System.out.println("Try Again");
            }
        }while(ch != 6);
        sc.close();
    }
}