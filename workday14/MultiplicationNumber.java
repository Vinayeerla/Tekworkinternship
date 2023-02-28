//Create an application that generates the multiplication table of a given number. Use a loop to display the table and conditional statements to check if the current number is a multiple of the given number.

import java.util.*;
class MultiplicationNumber
  {
    public static void main(String[] args)
    {
      char ch;
      do{
      Scanner obj=new Scanner(System.in);
      System.out.print("enter any number : ");
      int num=obj.nextInt();
      displayMultiplicationNumber(num);
    System.out.println("do you want one more multiplication table of any number ");
ch=obj.next().charAt(0);
    }while(ch!='n');
    }
    static void displayMultiplicationNumber(int num){
      int i=1;
      while(i<=10)
        {
          System.out.println(num*i);
          i=i+1;
        }
}
  }
    
  