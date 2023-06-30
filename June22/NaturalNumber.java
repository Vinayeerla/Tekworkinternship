/*Write a java program to print all natural numbers from 1 to n. - using while loop*/
import java.util.*;
class NaturalNumber{
  public static void main(String []u){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any number ");
    int num=sc.nextInt();
    int i=1;
    while(i<=num){
      System.out.println(i);
      i++;
    }
  }
}