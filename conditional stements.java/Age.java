import java.util.Scanner;
class  Age
{
	public static void main(String[] args) 
	{
		int age;
		Scanner obj=new Scanner(System.in);
		System.out.print("enter your age: ");
		age=obj.nextInt();
		
		if (age>=18)
			System.out.println(" you are eligible  for voting");
		else 
      System.out.println("you are not eligible for voting");

	}
}
