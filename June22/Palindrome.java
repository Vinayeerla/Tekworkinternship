import java.util.*;
class Palindrome{
  public static void main(String []p){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any number");
    int num=sc.nextInt();
    displayPalindrome(num);
  }
  static void displayPalindrome(int num){
    int temp=num,rem,palindrome=0;
    while(temp!=0){
      rem=temp%10;
      palindrome=(palindrome*10)+rem;
      temp=temp/10;
    }
    if(palindrome==num)
      System.out.println(num + " is a palindrome number");
    else
      System.out.println(num + " is not a palindrome number");
  }
}