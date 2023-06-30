/*Write a java program to print all even numbers between 1 to 100. */
import java.util.*;
class EvenNumbers{
  public static void main(String []u){
    Scanner sc =new Scanner(System.in);
    int i=1;
    while(i<100){
      if(i%2==0){
        System.out.println(i);
      }
      i++;
    }
  }
}