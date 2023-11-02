class Stack <T>{
          int tos;
          Stack(){
                    tos = -1;
          }
          void Push(T[] arr, T a){
                    tos++;
                    arr[tos] = a;
          }
          T Pop(T[] arr){
                    T a = arr[tos];
                    tos--;
                    return a;
          }
}
class Student {
    String name;
    int rollno;
    Student(String n, int r) {
        name = n;
        rollno = r;
    }
    void Display(){
          System.out.println(name + " " + rollno);
    }
}
class Employeer {
    String name;
    int id;
    Employeer(String n, int i) {
        name = n;
        id = i;
    }
    void Display(){
          System.out.println(name + " " + id);
    }
}
public class StackG {
          public static void main(String[] args) {
                    Stack<Student> s1 = new Stack<>();
                    Stack<Employeer> e1 = new Stack<>();
                    Student[] s = new Student[3];
                    Employeer[] e = new Employeer[3];
                    s1.Push(s, new Student("King", 01));
                    s1.Push(s, new Student("Queen", 02));
                    s1.Push(s, new Student("Rook", 03));
                    e1.Push(e, new Employeer("Mr.King", 1001));
                    e1.Push(e, new Employeer("Mrs.Queen", 1002));
                    e1.Push(e, new Employeer("Mr.Rook", 1003));
                    Student s0 = s1.Pop(s);
                    s0.Display();
                    Employeer e0 = e1.Pop(e);
                    e0.Display();
          }
}