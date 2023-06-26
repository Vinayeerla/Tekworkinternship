//Write a Program to check Armstrong numbers or Not.
import java.util.Scanner;
public class Check_Armstrong {
	public static void main(String[] args)
	{
 
        Scanner input = new Scanner(System.in);		
        System.out.print("Enter The Number : ");
        int n = input.nextInt();
		int rem,t = n,p = 0;
		while (n > 0) 
		{
			rem = n % 10;
			p = p + (rem * rem * rem);
			n = n / 10;
		}
		if (t == p) {
			System.out.println(p+" is Armstrong Number");
		}
		else {
			System.out.println(p+" is Not an Armstrong Number");
		}
	}
}