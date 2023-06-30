import java.util.*;
class PowerOfNumber{
  public static void main(String []p){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter base number");
    int base=sc.nextInt();
    System.out.println("Enter exponent number");
    int exponent=sc.nextInt();
    displayPowerOfNumber(base,exponent);
  }
  static void displayPowerOfNumber(int base, int exponent)
  {
    int power=1;
    for(int i=1; i<=exponent; i++){
      power=power*base;
    }
    System.out.println(power);
  }
}