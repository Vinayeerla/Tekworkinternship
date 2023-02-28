/*Grade Calculator: Create an application that takes a student's test scores and calculates their final grade. Use conditional statements to determine the letter grade (e.g. A, B, C, etc.) based on their scores.*/

import java.util.Scanner;

public class GradeCalculator {
  public static void main(String[] args) {
    double phy, che, math, bio, comp;
    Scanner obj = new Scanner(System.in);
    char ch;
    do
    {
      
    System.out.println("Enter physics marks");
    phy = obj.nextDouble();
    System.out.println("Enter physics marks");
    che = obj.nextDouble();
    System.out.println("Enter physics marks");
    math = obj.nextDouble();
    System.out.println("Enter physics marks");
    bio = obj.nextDouble();
    System.out.println("Enter physics marks");
    comp = obj.nextDouble();
    float per = ((float) (phy + che + math + bio + comp) / 500) * 100;
    if (per >= 90)
      System.out.println("Grade A");
    else if (per >= 80 && per < 90)
      System.out.println("Grade B");
    else if (per >= 70 && per < 80)
      System.out.println("Grade C");
    else if (per >= 50 && per < 70)
      System.out.println("Grade D");
    else
    {
      System.out.println("Grade F");
    }System.out.println("Do you want to calculate another student grade");
      ch = obj.next().charAt(0);
    } while (ch != 'n');
}
}