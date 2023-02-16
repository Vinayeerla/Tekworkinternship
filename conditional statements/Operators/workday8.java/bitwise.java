import java.util.Scanner;
class  bitwise
{
    public static void main(String[] args)
    {
        int a,b;
        Scanner obj=new Scanner(System.in);
        System.out.print("enter any number: ");
        a=obj.nextInt();
        System.out.print("enter any number: ");
        b=obj.nextInt();
       
        System.out.println("a&b " +(a&b));
        System.out.println("a|b " (a|b));
        System.out.println("a~b " (a~b));
        System.out.println("a^b " (a^b));
        System.out.println("a<<b " (a<<b));
        System.out.println("a>>b " (a>>b));
    }
}