//Write a java program to print all Strong numbers between 1 to n.
import java.util.Scanner;
class StrongNum{
  public static void main(String[] args){
    Scanner obj=new Scanner(System.in);
    System.out.print("enter any number : ");
    int num=obj.nextInt();
    for(int j=0;j<=num;j++){
    int fact=1,sum=0,rem;
    while(num!=0){
      rem=num%10;
      for(int i=1;i<=rem;i++){
      fact=fact*rem;
      }
      num=num/10;
      sum=sum+fact;
    }
    }
    if(sum==num)
      System.out.println("StrongNumber");
    else
       System.out.println(" not a StrongNumber");
    }
  }