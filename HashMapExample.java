// Hashmap Example
package HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String args[]){

        HashMap<Integer,String> map = new HashMap<>();

        display(map);

        //Add data into hashmap
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

        //copy one hashmap data to another
        HashMap<Integer,String> hmap = new HashMap<Integer,String>();
        hmap.putAll(map);
        hmap.remove(90);
        System.out.println("new map is : "+hmap);
        //clear first hashmap
        map.clear();
        display(map);
    }

    //function to print data
    public static void display(Map<Integer,String> map){
        if (map.isEmpty()){
            System.out.println("map is empty");
        }
        else{
            System.out.println(map);
        }
    }
}