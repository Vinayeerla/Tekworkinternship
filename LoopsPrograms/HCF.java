//Write a program to calculate HCF of Two given number.
import java.util.Scanner;
class HCF
{
    public static void main(String[] args)
    {
		Scanner sc = new Scanner(System.in);
 
		System.out.print("Enter the First Number :");
		int dividend = sc.nextInt();        
		System.out.print("Enter the Second Number :");
		int divisor = sc.nextInt();
		int rem, hcf = 0;
		do
		{
			rem = dividend % divisor;
			if(rem == 0)
			{
				hcf = divisor;
			}
			else
			{
				dividend = divisor;
				divisor = rem;
			}
		}while(rem != 0);
		System.out.println("HCF : " + hcf);
    }  
}