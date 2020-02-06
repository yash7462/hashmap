// Hashmap Example
package HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String args[]){

        HashMap<Integer,String> map = new HashMap<>();

        display(map);
        map.put(10,"yash");
        map.put(20,"jay");
        map.put(50,"vishal");
        map.put(90,"sukla");
        display(map);
        if (map.containsKey(20)){
            String temp = map.get(20);
            System.out.println("Value of 20 is : "+temp);
            System.out.println("value of 10 is : "+map.get(10));
        }
        System.out.println("entry set : "+map.entrySet());
        System.out.println("key set : "+map.keySet());
        System.out.println("values set : "+map.values());
        System.out.println("size is : "+map.size());
        HashMap<Integer,String> hmap = new HashMap<Integer,String>();
        hmap.putAll(map);
        hmap.remove(90);
        System.out.println("new map is : "+hmap);

        map.clear();
        display(map);
    }
    public static void display(Map<Integer,String> map){
        if (map.isEmpty()){
            System.out.println("map is empty");
        }
        else{
            System.out.println(map);
        }
    }
}