/*In this challenge, you will determine whether a string is funny or not. To determine whether a string is funny, create a copy of the string in reverse e.g.. Iterating through each string, compare the absolute difference in the ascii values of the characters at positions 0 and 1, 1 and 2 and so on to the end. If the list of absolute differences is the same for both strings, they are funny.
Determine whether a give string is funny. If it is, return Funny, otherwise return Not Funny.
Example
s=”lmnop”
The ordinal values of the characters are [108,109,110,111,112] .  and String reverse=”ponml” and  the ordinals are [112, 111, 110, 109, 108]. The absolute differences of the adjacent elements for both strings are [1, 1, 1, 1], so the answer is Funny.
Function Description
Complete the funnyString function in the editor below.
funnyString has the following parameter(s):
string s: a string to test
Returns
string: either Funny or Not Funny
Input Format
The first line contains an integer q , the number of queries.
The next q  lines each contain a string s .
 
Sample Input
STDIN   Function
-----   --------
2       q = 2
acxz    s = 'acxz'
bcxz    s = 'bcxz'
Sample Output
Funny
Not Funny*/
import java.util.*;
class FunnyTask{
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    String str1=new String();
    int num=s.nextInt();
    int i=0;
    while(i<num){
      System.out.println("enter any String 1");
      str1=s.nextLine();
      displayFunnyTask(str1);
      i++;
    }
  }
  static void displayFunnyTask(String str1){
    int i;
    String newstring1="";
    for(i=0;i<str1.length();i++){
      char ch1=str1.charAt(i);
      newstring1=ch1+newstring1;
    }
    
    for(i=1;i<str1.length();i++){
      if(str1.charAt(i)-str1.charAt(i-1)==newstring1.charAt(i-1)-newstring1.charAt(i)){
        System.out.println("funny");
        break;
    }
      else{
        System.out.println("not funny");
        break;
      }
    }
      
  }
}
