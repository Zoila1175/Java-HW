package Class25;

import java.util.ArrayList;
import java.util.HashSet;

public class E3Sets {
    public static void main(String[] args) {
        ArrayList<String>names=new ArrayList<>();
        names.add("Adrian");
        names.add("Adrian");
        System.out.println(names);
//HashSets do not allow duplicates, do not maintain order
        HashSet<String>uniqNames=new HashSet<>();
        uniqNames.add("Yellow");
        uniqNames.add("Yellow");
        uniqNames.add("green");
        System.out.println(uniqNames);
        for(String name:uniqNames){
            System.out.println(names);
        }
    }
}
