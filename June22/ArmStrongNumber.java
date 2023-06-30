import java.util.*;
/*class ArmStrongNumber{
  public static void main(String []p){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any number");
    int num=sc.nextInt();
    displayArmStrongNumber(num);
  }
  static void displayArmStrongNumber(int num){
    int temp=num;
    int rem;
    int count=0;
    double sum=0;
    while(temp>0){
      temp=temp/10;
      count++;
    }
    temp=num;
    while(temp>0){
      rem=temp%10;
      sum=sum+Math.pow(rem,count);
      temp=temp/10;
    }
    if(num==sum)
      System.out.println(num + " is a armstrong number");
    else 
      System.out.println(num +" is not a armstrong number");
  }
}*/
//armstrong number 1 to n
class ArmStrongNumber{
  static int isArmStrong(int num){
    int count=0,rem,sum=0,temp=num;
    while(temp>0){
      temp/=10;
      count++;
    }
    temp=num;
    while(temp>0){
      rem=temp%10;
      sum=sum+(rem*rem*rem);
      temp=temp/10;
    }
    return sum;
  }
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number for armstrong number upto");
    int num=sc.nextInt();
    int i=1,arm;
    System.out.println("Armstrong numbers are: ");
    while(i<num){
      arm=isArmStrong(i);
      if(arm==i){
        System.out.println(arm);
      }
      i++;
    }
  }
}