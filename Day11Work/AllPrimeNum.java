//Write a java program to print all Prime numbers between 1 to n
import java.util.Scanner;
class AllPrimeNum{
  public static void main(String[] args){
    int count=0;
    Scanner obj=new Scanner(System.in);
    System.out.print("enter any number of n :" );
    int n=obj.nextInt();
    System.out.print("enter any number of m :" );
    int m=obj.nextInt();
    while(n<=m){
      if(m%n==0){
        count=count+1;
        n++;
    
      if(count==2){
        System.out.println("prime number " );
      }
      else
        System.out.println(" not a prime number " );
        
    }
  }
}