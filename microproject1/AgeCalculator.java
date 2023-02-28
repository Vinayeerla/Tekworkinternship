/*Age Calculator  :  Create an application that takes a person's birthdate as input and calculates their current age. Use conditional statements to determine if they are a minor or an adult.*/
import java.util.Scanner;

class AgeCalculator
  {
  public static void main(String[] args)
    {
    Scanner obj = new Scanner(System.in);
    char ch;
    do
    {
      
    System.out.println("Enter person Birth year");
    int persons_Birthyear = obj.nextInt();
    System.out.println("Enter present_year ");
    int present_year = obj.nextInt();
    
    int age = present_year - persons_Birthyear;
    if (age >= 18)
      System.out.println("person is major");
    else
      System.out.println("person is minor");
  System.out.println("Do you want to enter another Birth year");
      ch = obj.next().charAt(0);
    }while(ch!='n');
}
}