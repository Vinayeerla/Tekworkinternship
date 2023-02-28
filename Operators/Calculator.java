import java.util.*;
class Calculator
  {
    public static void main(String[] args)
    {
      double num1,num2,res;
      char ch,repeat;
      Scanner a=new Scanner(System.in);
      do
        {
          System.out.print("enter any two numbers of num1,num2: ");
          num1=a.nextDouble();
          num2=a.nextDouble();
          System.out.print("enter any chaacter like (=,-,*,%): "); 
          ch=a.next().charAt(0);
      switch(ch)
        {
          case '+':
            res = num1+num2;
            System.out.println("Addition of two number num1 and num2 is " + res + " ");      
            break;
          case '-':
            res = num1-num2;
            System.out.println("Subtraction of two number num1 and num2 is " + res + " ");
            break;

          case '*':
            res = num1*num2;
            System.out.println("Multiplication of two number num1 and num2 is " + res + " ");
            break;

          case '/':
            res = num1/num2;
            System.out.println("Division of two number num1 and num2 is " + res + " ");
            break;

          default:
            System.out.println("Please enter right character ");
        }
          System.out.println("do you want exection one more time ");
          repeat =a.next().charAt(0);
        }while(repeat!='n');
    }
  }