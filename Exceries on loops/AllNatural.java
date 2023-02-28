
// Write a java program to print all even numbers between 1 to 100. - using while 
import java.util.Scanner;
class AllNatural {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.print("enter the value of n : ");
    int n = obj.nextInt();
    System.out.print("enter the value of m : ");
    int m = obj.nextInt();
    AllNatural.All(n, m);
  }

  public static void All(int n, int m) {
    while (n <= m) {
      if (n % 2 == 0) {
        System.out.println(n);
        n++;
      }
    }
  }
}