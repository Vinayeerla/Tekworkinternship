/*Create class Capitalize having add(), checkCapital() to read data and to verify whether every word of a given text is starting with an upper case vowel or not if it's not starting with the upper case vowel generate a custom exception.  Test your application for any 5 different inputs. Use an array of objects for the test cases. */
import java.util.*;
class Capitalize{
  String word;
  public void add(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter word");
    try{
    word=sc.nextLine();
  }
    catch(Exception e){
      System.out.println("word name should have only alphabets");
    }
  }
  public void CheckCapital(){
    String array[]=word.split(" ");
    for(int i=0;i<array.length;i++){
      String str=array[i];
    try{
      if(str.charAt(0)=='A' || str.charAt(0)=='E' || str.charAt(0)=='I' || str.charAt(0)=='O' || str.charAt(0)=='U'){
        System.out.println(str + " given text is starting with an upper case vowel ");
      }
      else {
        throw new InvalidWordException(str + " given text is starting with an lower case vowel ");
      }
    }
      catch(InvalidWordException w){
      System.out.println("Error : " + w.getMessage());
      }
    }
  }
}
class CapitalizeTest{
  public static void main(String []args){
    Capitalize c[]=new Capitalize[5];
    for(int i=0;i<5;i++){
        c[i]=new Capitalize();
        c[i].add();
        c[i].CheckCapital();
      }
  }
}