//*Write a java program to count number of digits in a number
import java.util.Scanner;
class CountofNumber
  {
    public static void main(String[] args)
    {
  
      Scanner obj=new Scanner(System.in);
      System.out.print("enter any number: ");
      int num=obj.nextInt();
      CountofNumber.All(num);
    }
    public static void All(int num)
    { 
      int count=0;
      while(num!=0){
        num=num/10;
        count=count+1;
      }
         
        System.out.print(count);
      }
  } 
    
  