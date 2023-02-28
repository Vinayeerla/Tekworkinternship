/*Rock Paper Scissors Program :  Create a simple game of rock-paper-scissors where the user plays against the computer. Use conditional statements to determine the winner of each round.*/
import java.util.Scanner;
import java.util.Random;

class RockPaperScissors {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    char ch;
      System.out.println(" (choose rock or paper or scissors)");
      System.out.println("vinay choice");
      String vinay = obj.nextLine();

      Random random = new Random();
      int randomno = random.nextInt(3);

      String computer;
      if (randomno == 0)
        computer = "rock";
      else if (randomno == 1)
        computer = "paper";
      else
        computer = "scissors";
      System.out.println("Computer chose " + computer);

      if (vinay.equals(computer))
        System.out.println("it's Tie");

      else if (vinay.equals("rock"))
      {
        if (computer.equals("scissors"))
          System.out.println("vinay wins");
      }

      else if (vinay.equals("paper")) 
      {
        if (computer.equals("rock"))
          System.out.println("vinay wins");
      } else if (vinay.equals("scissors"))
      {
        if (computer.equals("paper"))
          System.out.println("vinay wins");
      } else if (computer.equals("rock")) 
      {
        if (vinay.equals("scissors"))
          System.out.println("vinay wins");
      }

      else if (computer.equals("paper"))
      {
        if (vinay.equals("rock"))
          System.out.println("vinay wins");
      } else if (computer.equals("scissors"))
      {
        if (vinay.equals("paper"))
          System.out.println("vinay wins");
      }
      
  }
}