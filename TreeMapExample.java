package TreeMap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String args[]){
        TreeMap<Integer,String> tree_map = new TreeMap<Integer, String>();
        System.out.println("tree succesfully created");

        tree_map.put(10,"Yash");
        tree_map.put(20,"Devang");
        tree_map.put(90,"nisarg");
        tree_map.put(50,"Bhargav");

        System.out.println("TreeMap is : "+tree_map.entrySet());

        System.out.println("Is Key "+40+" present? "+tree_map.containsKey(40));
        System.out.println("Is Key "+"Devang"+" present? "+tree_map.containsValue("Devang"));

        System.out.println(tree_map.firstEntry());
        System.out.println(tree_map.firstKey());
        System.out.println(tree_map.floorEntry(40));

       /* HashMap<Integer,String> hmap = new HashMap<Integer, String>(tree_map);
        System.out.println("Treemap convert in Hashmap is \n: "+hmap.entrySet());*/

        System.out.println("traversal of tree");

        for (Map.Entry<Integer,String> e:tree_map.entrySet()) {
            System.out.println(e.getKey()+" "+e.getValue());
        }

    }
}
