//Write a program to input any alphabet and check whether it is vowel or consonant. using switch statement
import java.util.Scanner;
class VowelConsonant
  {
    public static void main(String[] args)
    {
      char ch;
      Scanner obj=new Scanner(System.in);
      System.out.print("enter any character: ");
      ch=obj.next().charAt(0);
      switch(ch)
        {
          case 'a':
            System.out.println("Given character " + ch + " is vowel");
            break;
          case 'e':
            System.out.println("Given character " + ch + " is vowel");
            break;
          case 'i':
            System.out.println("Given character " + ch + " is vowel");
            break;
          case 'o':
            System.out.println("Given character " + ch + " is vowel");
            break;
          case 'u':
            System.out.println("Given character " + ch + " is vowel");
            break;
          default:
            System.out.println("Given character " + ch + " is consonant");
        }
    }
  }
  