import java.util.*;
/*class PerfectNumber{
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any number");
    int num=sc.nextInt();
    displayPerfectNumber(num);
  }
  static void displayPerfectNumber(int num){
    int sum=0;
    for(int i=1; i<=num; i++){
      if(num%i==0){
        sum+=i;
      }
    }
    if(sum==num)
      System.out.println(num + " is a perfect number");
    else
      System.out.println(num + " is not a perfect number");
  }
}*/
class PerfectNumber{
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any number");
    int num=sc.nextInt();
    for(int i=0; i<=num; i++){
      if(isPerfectNumber(i)){
        System.out.println(i + " is a perfect number");
      }
    }
  }
  static boolean isPerfectNumber(int n){
    int sum=0;
    for(int j=1; j<=n; j++){
      if(n%j==0){
        sum+=j;
      }
    }
    return sum==n;
  }
}
