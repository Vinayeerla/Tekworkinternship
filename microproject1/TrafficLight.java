/*Traffic Light Simulator: Create a simulation of traffic lights at a junction. Use conditional statements to change the lights based on the time of day and the traffic flow.*/

import java.util.Scanner;

public class TrafficLight {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    char option;
    do{
      System.out.println("enter the time in seconds within 60sec");
      int time =s.nextInt();
      if(time>0 && time<=20)
        System.out.println("Green signal");
      else if(time>0 && time<=20)
        System.out.println("Red signal");
      else{
        System.out.println("Yellow signal");
      }System.out.println("Do you want to enter again ");
      option = s.next().charAt(0);
    } while (option != 'n');
  }}