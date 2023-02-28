/*Electricity bill app along with GST: create an application that takes previous units and present units, and find number of units, based on numbers of units find the electricity bill along with GST. use conditional statements to determine the unit slabs.*/
import java.util.Scanner;
class ElectricityBill
  {
    public static void main(String[] args)
    {
      Scanner obj = new Scanner(System.in);
      char ch;
      do{
      System.out.println("Enter no of units");
      double unit=s.nextDouble();
      double amount;
      if(unit<=50)
      {
          amount= unit*0.5 ;
          System.out.println("Bill amount is"+ amount);
      }
      else if (unit<=150 && unit>50)
      {
          amount=unit*0.75;
          System.out.println("Bill amount is"+ amount);
      }
      else if ( unit <=250 && unit>150)
      {
          amount=unit*1.20;
          System.out.println("Bill amount is"+ amount);
      }
      else
      {
          amount=unit*1.50;
          System.out.println("Bill amount is"+ amount);
        }System.out.println("Do you want to chech another year");
         ch = obj.next().charAt(0);
    } while (ch != 'n');
  }
  }