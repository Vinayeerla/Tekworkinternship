import java.util.*;
class MainMethods{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    BookingImp emobj=new BookingImp();
    char ch;
    int choice;
    do{
    System.out.println("1.registeration");
    System.out.println("2.sign in");
      System.out.println("enter u r choice");
      choice=sc.nextInt();
      switch(choice){
        case 1: emobj.register();
          break;
        case 2: emobj.signin();
          System.out.println("1.add theater details");
          System.out.println("2.theater details");
          System.out.println("3.ticket booking");
          System.out.println("enter u r choice");
          int option=sc.nextInt();
          switch(option){
              case 1: emobj.theateradd();
          break;
        case 2: emobj.theaterinfo();
          break;
        case 3: emobj.bookingticket();
          break;
        default :
          System.out.println("enter correct number");
          break;
          }
          break;
        default :
          System.out.println("enter correct number");
          break;
      }
      System.out.println("do u want one more operation");
      ch=sc.next().charAt(0);
    }
      while(ch!='n');
  }
}