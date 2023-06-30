import java.util.*;
/*class StrongNumber{
  public static void main(String []p){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any number");
    int num=sc.nextInt();
    displayStrongNumber(num);
  }
  static void displayStrongNumber(int num){
   int rem,fact=1,sum=0;
    int temp=num;
    while(num!=0){
      rem=num%10;
      for(int i=1; i<=rem; i++){
        fact=fact*i;
      }
      sum=sum+fact;
      num=num/10;
    }
    if(temp==sum)
      System.out.println(num + " is a strong number");
    else 
      System.out.println(num + " is not a strong number");
  }
}*/
//up to n
class StrongNumber{
  static boolean isStringNumber(int num){
    int rem,sum=0;
    int temp=num;
    while(temp!=0){
      rem=temp%10;
      sum=sum+fact(rem);
      temp=temp/10;
    }
    return num==sum;
  }
    static int fact(int rem){
      int f=1;
    for(int i=1; i<=rem; i++){
      f=f*i;
    }
    return f;
  }
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number strong number upto n");
    int num=sc.nextInt();
    System.out.println("Strong numbers are: ");
    for(int i=1; i<=num; i++){
      if(isStringNumber(i)){
        System.out.println(i);
      }
    }
  }
}