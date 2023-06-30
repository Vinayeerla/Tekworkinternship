/* Write a java program to input electricity unit charges and calculate total electricity bill according to the given condition:
    For first 50 units Rs. 0.50/unit
    For next 100 units Rs. 0.75/unit
    For next 100 units Rs. 1.20/unit
     For unit above 250 Rs. 1.50/unit
     An additional surcharge of 20% is added to the bill*/
import java.util.Scanner;
class Electricity
  {
    public static void main(String[] args)
    {
      int unit;
      Scanner obj=new Scanner(System.in);
      System.out.print("enter units : " );
      unit=obj.nextInt();
      if(unit<=50)
        System.out.println("Electricity bill is " + (unit*0.5+0.2));
      else if(unit>50 && unit<=100)
          System.out.println("Electricity bill is " + (unit*0.75+0.2));
      else if (unit>100 && unit<=200)
        System.out.println("Electricity bill is " + (unit*1.20+0.2));
      else
        System.out.println("Electricity bill is " + (unit*1.50+0.2));
    }
  }