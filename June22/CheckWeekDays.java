import java.util.Scanner;
class WeekDay
  {
  public static void main(String[] args)
    {
    int weekno;
    Scanner obj=new Scanner(System.in);
    System.out.print("enter weeko: ");
    weekno=obj.nextInt();
    switch(weekno)
      {
          case 1:
              System.out.print("Monday");
          case 2:
              System.out.print("Thuesday");
          case 3:
              System.out.print("wednesday");
          case 4:
              System.out.print("thuresday");
          case 5:
              System.out.print("Friday");
          case 6:
              System.out.print("Saturday");
          case 7:
              System.out.print("Sunday");
        default:
             System.out.println("enter a number between 1 and 7");
      }
    }
  }