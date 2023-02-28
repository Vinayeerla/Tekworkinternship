import java.util.Scanner;
class Arithmetic
  {
    public static void main(String[] args)
    {
      int a,b;
      Scanner obj=new Scanner(System.in);
      System.out.print("enter any number :");
      a=obj.nextInt();
      System.out.print("enter any number :");
      b=obj.nextInt();
      System.out.println("Addition of two numbers a and b is " + (a+b) +" ");
      System.out.println("Subtraction of two numbers a and b is " + (a-b) +" ");
      System.out.println("Multiplication of two numbers a and b is " + (a*b) +" ");
      System.out.println("Division of two numbers a and b is " + (a/b) +" ");
      System.out.println("Modulo of two numbers a and b is " + (a%b) +" ");
    }
  }