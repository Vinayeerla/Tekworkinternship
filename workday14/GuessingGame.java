//Create a number guessing game where the computer generates a random number and the user has to guess it. if user Guess is incorrect, then give hints (weather the actual number is less than/ greater than guess number).

import java.util.*;

class GuessingGame{
  public static void main(String[] args){
    Random random=new Random();
    long random_num=random.nextLong();     
    displayGuessNumber(random_num);
  }
  public static void displayGuessNumber(long random_num)
  {
    for(int i=0;i>=0;i++)
      {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the number : ");
        long num=obj.nextInt();
        if(num==random_num){
          System.out.println(" your correct ");
          break;
        }
        else if(num!=random_num){
           System.out.println(" your wrong ");
          System.out.println("clue for guessing the number is below");
          if(num< random_num)
                System.out.println("Entered Number is less than Actual Number"); 
          else
                System.out.println("Entered Number is greater than Actual Number"); 
      }
  }
}
}