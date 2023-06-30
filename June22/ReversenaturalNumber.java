/*Write a java program to print all natural numbers in reverse (from n to 1). -     using while loop*/
import java.util.*;
class ReversenaturalNumber{
  public static void main(String []y){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Any Number");
    int num=sc.nextInt();
    while(num!=0){
      System.out.println(num);
      num--;
    }
  }
}