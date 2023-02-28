import java.util.*;
class Calculator
  {
    public static void main(String[] args)
    {
      double num1,num2,res;
      char ch;
      Scanner a=new Scanner(System.in);
      System.out.print("enter any chaacter like (=,-,*,%): "); 
          ch=a.next().charAt(0);
      while(ch=='+' || ch=='-' || ch=='*' || ch=='/')
        {
          System.out.print("enter any two numbers of num1,num2: ");
          num1=a.nextDouble();
          num2=a.nextDouble();
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
        }
    }
  }