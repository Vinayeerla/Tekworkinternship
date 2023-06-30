import java.util.Scanner;
class CheckVowelAndConstant
  {
    public static void main(String[] args)
    {
      char ch;
      Scanner obj=new Scanner(System.in);
      System.out.print("enter any character :");
      ch=obj.next().charAt(0);
      if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
        System.out.println("given character "+ch +"is a vowel");
      else 
        System.out.println("given character "+ch +"is a consonant");
    }
  }