import java.util.*;
class StringDemo{
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any String 1");
    String str=sc.nextLine();
    System.out.println("Enter any String 2");
    String str1=sc.nextLine();
    System.out.println("Length of the String 1 is: " +str.length());
    System.out.println("=======================================");
    System.out.println("to convert String 1 into upper case letter are: " +str.toUpperCase());
    System.out.println("=======================================");
    System.out.println("to convert String 1 into lower case letters: " + str.toLowerCase());
    System.out.println("=======================================");
    System.out.println("Cancate of the two Strings are: " + str.concat(str1));
    System.out.println("=======================================");
    System.out.println("Two String are equals? " + str.equals(str1));
    System.out.println("=======================================");
    System.out.println("Two String are equals? " + str.equalsIgnoreCase(str1));
    System.out.println("=======================================");
    System.out.println("str1 is there in str? "+ str.contains(str1));
    System.out.println("=======================================");
    System.out.println(str + " Starting with \"he\"? "+ str.startsWith("he"));
    System.out.println("=======================================");
    System.out.println("Replace the all occurance of a character \"h\" with \"a\"     " + str.replace("h", "a"));
    System.out.println("=======================================");
    System.out.println(str.trim());
    System.out.println("=======================================");
    String []arr=str.split(" ");
    int count=0;
    for(String s: arr)
      count++;
    System.out.println("count of the words in a string 1: " + count);
    
  }
}