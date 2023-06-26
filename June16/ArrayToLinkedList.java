//1. Using Arrays class asList() method
import java.util.*;
public class ArrayToArrayList {
    public static void main(String args[]) {
      String[] names={"vinay", "manu", "abhi"};
      //LinkedList<String> list= new LinkedList<>(Arrays.asList(names));
      /*list.add("ajay");
      list.add("moahn");
      for(String s : list) {
        System.out.println(s);      
      }*/
      //Using Collections class addAll() method
      /*Collections.addAll(list,names);
      list.add("chinni");
      for(String ele : list) {
        System.out.println(ele);      
      }*/

      //Using add() method
      LinkedList<String> list=new LinkedList<>();
      for(int i=0; i<names.length; i++)
        list.add(names[i]);
      for(String name: list)
        System.out.println(name);
    }
}
