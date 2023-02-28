//Write a java program to check whether a number is Perfect number or not
import java.util.Scanner;
class Perfect{
  public static void main(String[] args){
    int rem,sum=0;
    Scanner obj=new Scanner(System.in);
    System.out.print("enter any number : " );
    int num=obj.nextInt();
    for(int i=1;i<num;i++){
      rem=num%i;
      if(rem==0){
        sum=sum+i;
    }
    }
    if(num==sum)
      System.out.println("perfect number");
    else 
      System.out.println(" not a perfect number");
  }
}