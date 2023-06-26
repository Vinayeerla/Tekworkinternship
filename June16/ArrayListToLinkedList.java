import java.util.*;
class ArrayListToLinkedList{
  public static void main(String []args){
    ArrayList<String> l = new ArrayList<String>();
    l.add("Orange");
    l.add("Apple");
    l.add("Peach");
    l.add("Guava");
    l.add("Pear");
    List<String> aList = new LinkedList<String>(l);
    aList.add("apple");
    for (Object i : aList) {
      System.out.println(i);
    }
  }
}