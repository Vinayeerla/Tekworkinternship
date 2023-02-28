//Write a java program to enter a number and print it in words
import java.util.Scanner;
class NumToWords
  {
    public static void main(String[] args){
      int rem;
      Scanner obj=new Scanner(System.in);
      System.out.print("enter any num :");
      int num=obj.next().charAt(0);
     while(num!=0){
       rem=num%10;
      switch(rem){
        case 0:
          System.out.println("Zero");
          break;
        case 1:
          System.out.println("one");
          break;
        case 2:
          System.out.println("Two");
          break;
        case 3:
          System.out.println("Three");
          break;
        case 4:
          System.out.println("Four");
          break;
        case 5:
          System.out.println("Five");
          break;
        case 6:
          System.out.println("Six");
          break;
        case 7:
          System.out.println("Seven");
          break;
        case 8:
          System.out.println("Eight");
          break;
        case 9:
          System.out.println("Nine");
          break;
        default:
          System.out.println("enter a valid number from 1 to 9");
          break;
      }
       num=num/10;
      }
    }
  }