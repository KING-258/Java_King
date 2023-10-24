import java.util.Scanner;
class DateException extends Exception{
          String Error;
          DateException(String s){
                    Error = s;
          }
}
class CurrentDate{
          int day;
          int Month;
          int year;
          void CreateDate(){
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Input Day : ");
                    day = sc.nextInt();
                    System.out.print("Input Month : ");
                    Month = sc.nextInt();
                    System.out.print("Input Year : ");
                    year = sc.nextInt();
                    sc.close();
          }
}
public class Date {
          public static void main(String[] args) {
                    DateException d1 = new DateException("Invalid Month");
                    DateException d2 = new DateException("Invalid Day");
                    CurrentDate c1 = new CurrentDate();
                    try {
                              c1.CreateDate();
                              if(c1.Month >12 || c1.Month <1)
                              {
                                        throw d1;
                              }
                              if(c1.Month == 1 || c1.Month == 3 || c1.Month == 5 || c1.Month == 7 || c1.Month == 8 || c1.Month == 10 || c1.Month == 12){
                                        if(c1.day > 31 || c1.day < 1)
                                        {
                                                  throw d2;
                                        }
                              }
                              else if(c1.Month != 2){
                                        if(c1.day > 30 || c1.day < 1){
                                                  throw d2;
                                        }
                              }
                              else{
                                        if(c1.year % 4 == 0)
                                        {
                                                  if(c1.day > 29 || c1.day < 1)
                                                  {
                                                            throw d2;
                                                  }
                                        }
                                        else{
                                                  if(c1.day > 28 || c1.day < 1)
                                                  {
                                                            throw d2;
                                                  }
                                        }
                              }
                    } catch(DateException d){
                              System.out.println("Exception Occured : " + d.Error);
                    }
          }
}