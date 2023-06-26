/*class LargestWord{
  static void displayLargestWord(String str){
    String arr[]=str.split(" ");
    String longWord="";
    int i;
    for(i=0; i<arr.length; i++){
      if(longWord.length()>arr[i].length()){
        longWord=arr[i];
        System.out.println(longWord);
      }
    }
  }
  public static void main(String []args){
    String str="hi hello world";
    displayLargestWord(str);
  }
}*/
/*import java.util.*;
class StringToken{
  public static void main(String []args){
    StringTokenizer st = new StringTokenizer("hh hello world");
    while(st.hasMoreTokens()){
      String str=st.nextToken();
      String rev="";
      for(int i=0; i<str.length(); i++){
        rev=str.charAt(i)+rev;
      }
      if(rev.equals(str)){
        System.out.println(str + " is a palindrome");
      }
      else 
        System.out.println(str + " is not a palindrome");
    }
    
  }
}*/
class StringToken{
  public static void main(String []args){
    String str="hello madam";
    String arr[]=str.split(" ");
    for(int i=0; i<arr.length; i++){
      String temp=arr[i];
      String rev=" ";
      for(int j=0; j<temp.length(); j++){
        rev=temp.charAt(j)+rev;
      }
      if(temp.equals(rev)){
        System.out.println(temp);
      }
    }
  }
}