//Write a java program to find the maximum occurring character in a given String
import java.util.*;
class MaxCharacter{
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any String ");
    String str=sc.nextLine();
    displayMaximumCharacterscount(str);
  }
  static void displayMaximumCharacterscount(String str){
    char ch[]=str.toCharArray();
    int count[]=new int[str.length()];
    char maxchar=str.charAt(0);
    int max=0;
    int i, j;
    for(i=0; i<ch.length; i++){
      count[i]=1;
      for(j=i+1; j<ch.length; j++){
        if((ch[i]==ch[j]) && ch[i]!=' '){
          count[i]++;
          ch[j]='0';
        }
      }
    if((max<count[i]) && count[i]!='0'){
      max=count[i];
      maxchar=ch[i];
    }
    }
    System.out.println("maximum character count is " + max + " " + maxchar);
  }
}