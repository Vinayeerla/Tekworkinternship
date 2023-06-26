import java.util.*;

class ArrayListToHashMap{
  public static void main(String []args){
    ArrayList<String> list=new ArrayList<>();
    list.add("apple");
    list.add("Peach");
    list.add("mango");
    list.add("Guava");
    list.add("Pear");
    Map<String, Integer> mapList=new HashMap<>();
    for(int i=0; i<list.size(); i++){
      String key=list.get(i);
      int value=i;
      mapList.put(key,value);
    }
    for(Map.Entry<String, Integer> entry: mapList.entrySet())
      System.out.println(entry.getKey() + " " + entry.getValue());
  }
}