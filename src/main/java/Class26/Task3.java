package Class26;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/*Create a map of Best Buy store. Place
item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
Retrieve all keys and values from a Best Buy map using EntrySet.*/
public class Task3 {
    public static void main(String[] args) {
        Map<Integer, String> bestBuy=new LinkedHashMap<>();
        bestBuy.put(124365,"Printer");
        bestBuy.put(198765,"Monitor");
        bestBuy.put(123456, "Router");
        bestBuy.put(125432,"Fax");
        bestBuy.put(324354,"Laptop");
        //Set<Map.Entry<Integer,String >>entrySet=bestBuy.entrySet();
         var entrySet=bestBuy.entrySet();
         for (var e:entrySet){
             System.out.println(e.getKey()+" = "+e.getValue());
         }

    }
}
