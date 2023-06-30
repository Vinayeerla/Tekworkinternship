import java.util.*;
class FirstAndLastNumber{
  public static void main(String []p){
    Scanner sc =new Scanner(System.in);
    System.out.println("ENetr any number");
    int num=sc.nextInt();
    int firstdigit=0;
    int lastdigit;
    lastdigit=num%10;
    while(num!=0){
      firstdigit=num%10;
      num=num/10;
    }
    System.out.println("firstdigit" + firstdigit + "lastdigit" + lastdigit);
  }
}