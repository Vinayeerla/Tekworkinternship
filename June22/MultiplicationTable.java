import java.util.*;
class MultiplicationTable{
  public static void main(String []o){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any number");
    int num=sc.nextInt();
    int multiple=1;
    for(int i=0; i<num; i++){
      multiple=multiple*i;
      System.out.print(multiple);
    }
  }
}