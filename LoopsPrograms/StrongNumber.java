//Write a program to check Strong numbers or Not.
import java.util.Scanner;
class StrongNumber
{
	public static void main(String args[])
    {
     Scanner sc = new Scanner(System.in);		
     System.out.print("Enter The Number : ");
     int n = sc.nextInt();
		 int i,fact_n,rem,total = 0,temp = n;
		 while(n != 0){
			i = 1;
			fact_n = 1;
			rem = n % 10;
			while(i <= rem)
			{
				fact_n = fact_n * i;
				i++;
			}
			total = total + fact_n;
			n = n / 10;
		}
		if(total == temp)
			System.out.println(temp + " is a Strong Number");
		else
			System.out.println(temp + " is not a Strong Number");
     }
}