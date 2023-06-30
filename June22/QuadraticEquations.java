/*Write a Java program to solve quadratic equations (use if, else if and else)*/

import java.util.*;
public class QuadraticEquations {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the coefficients of the quadratic equation (a, b, c):");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int discriminant = b*b-4*a*c;
    if (a == 0) {
      System.out.println("Not a quadratic equation.");
    } else if (discriminant > 0) {
      double root1 = (-b+Math.sqrt(discriminant))/(2*a);
      double root2 = (-b-Math.sqrt(discriminant))/(2*a);
      System.out.println("Roots are real and different.");
      System.out.println("Root 1 = " + root1);
      System.out.println("Root 2 = " + root2);
    } else if (discriminant == 0) {
      int root = -b/(2*a);
      System.out.println("Roots are real and equal.");
      System.out.println("Root = " + root);
    } else {
      double realPart = -b/(2 * a);
      double imaginaryPart = Math.sqrt(-discriminant)/(2*a);
      System.out.println("Roots are complex and different.");
      System.out.println("Root 1 = " + realPart + " + " + imaginaryPart + "i");
      System.out.println("Root 2 = " + realPart + " - " + imaginaryPart + "i");
      }
    }
}
