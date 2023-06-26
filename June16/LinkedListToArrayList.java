import java.util.*;
class LinkedListToArrayList{
  public static void main(String[] args) {
    LinkedList<String> l = new LinkedList<String>();
    l.add("Orange");
    l.add("Apple");
    l.add("Peach");
    l.add("Guava");
    l.add("Pear");
    List<String> aList = new ArrayList<String>(l);
    aList.add("apple");
    for (Object i : aList) {
      System.out.println(i);
    }
  }
}