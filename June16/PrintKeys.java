import java.util.*;
class PrintKeys{
  public static void main(String []args){
    HashMap<String, Integer> map=new HashMap<>();
    map.put("apple",1);
    map.put("Peach",2);
    map.put("mango",3);
    System.out.println(map);
    for(String keys:map.keySet())
      System.out.println(keys);
    for(int value:map.values())
      System.out.println(value);
  }
}