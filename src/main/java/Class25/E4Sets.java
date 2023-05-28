package Class25;

import java.util.LinkedHashSet;

public class E4Sets {
    //LinkHashSet will not allow duplicates, it will remember the order
    public static void main(String[] args) {
        LinkedHashSet<String>fruit=new LinkedHashSet<>();
        fruit.add("Kiwi");
        fruit.add("Apple");
        fruit.add("Orange");
        fruit.add("Mango");
        System.out.println(fruit);
    }
}
