public class LastOccurrenceOfCharacter {
  public static void main(String[] args) {
    String str = "Hi, Hello World";
    char search = 'l';
    int lastIndex = displayLastOccurrenceOfCharacter(str, search);
    if (lastIndex != -1) {
      System.out.println("Last occurrence of '" + search + "' is at index " + lastIndex);
      } else {
        System.out.println("'" + search + "' is not found in the string.");
    }
  }
  public static int displayLastOccurrenceOfCharacter(String str, char search) {
    int lastIndex = -1;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == search) {
        lastIndex = i;
        }
    }
    return lastIndex;
  }
}
/*import java.util.*;
class ArrayDemo{
  public static void main(String []args){
    //static way
    int num[]={123,234,345};
    int arr[]=new int[num.length];
    //dynamic way
    for(int i=0; i<num.length; i++){
      int temp=num[i];
      int rev=0,rem=0;
      while(temp!=0){
        rem=temp%10;
        temp=temp/10;
        rev=(rev*10)+rem;
      }
      num[i]=rev;
    }
    for(int i: num)
      System.out.println(i);
  }
}*/
/*class Number{
  public static void main(String []args){
  int num=123;
  int first=0, last=0;
  last=num%10;
  while(num!=0){
    first=num%10;
    num=num/10;
  }
  System.out.println(first+last);
  }
}*/