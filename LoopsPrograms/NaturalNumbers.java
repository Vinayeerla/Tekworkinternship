//Write a program to print all natural numbers from 1 to n.
import java.util.Scanner;
class NaturalNumbers
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Starting Number : ");
		int start =sc.nextInt();
		System.out.print("Enter The Ending Number : ");
		int end =sc.nextInt(); 
		while(start<=end)
		{
			System.out.println(start);
			s++;
		}
	}
}