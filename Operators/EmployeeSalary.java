/*Employee Salary Calculator: Create an application that takes an employee's salary and calculates their annual salary, tax and net salary. Use conditional statements to determine the tax bracket and calculate the tax accordingly.*/

import java.util.Scanner;

class EmployeeSalary
{
  public static void main(String[] args) 
  {
    Scanner obj = new Scanner(System.in);
    char ch;
    do{
      System.out.println("enter the monthly salary");
      double mon_salary= obj.nextDouble();
      double Annual_salary=mon_salary*12;
      System.out.println("Annual salary is" + Annual_salary);
      if (Annual_salary<=350000)
      {
        double tax=Annual_salary*0.10;
        System.out.println("tax paid is"+ tax);
        double net_salary=Annual_salary-tax;
        System.out.println("net salary is"+net_salary);
      }
      else if (Annual_salary>350000 && Annual_salary<=700000)
            {
              double tax=Annual_salary*0.20;
              System.out.println("tax paid is"+ tax);
              double net_salary=Annual_salary-tax;
             System.out.println("net salary is"+net_salary);
            }
      else
      {
      double tax=Annual_salary*0.30;
      System.out.println("tax paid is"+ tax);
      double net_salary=Annual_salary-tax;
      System.out.println("net salary is"+net_salary);
      }
      System.out.println("Do you want to enter again ");
      ch = obj.next().charAt(0);
    } while (ch != 'n');
  }
}