package Class23;



import java.util.ArrayList;

public class E3Collection {
    public static void main(String[] args) {
        ArrayList<String>names=new ArrayList<>();
        names.add("Maria");//0 index will readjust when you remove an index
        names.add("Kate");//1
        names.add("Eily");//2
        names.add("Hazel");//3
        names.add("Celia");//4
        names.add("Paula");//5

        names.remove("Kate");
        names.remove(2);

        System.out.println(names.indexOf("Celia"));
        //names clear();
        System.out.println(names);
        //[Maria, Eily, Celia, Paula]// you removed Kate, then count index again and will remove 2
        for(int i=0;i< names.size(); i++);
       // System.out.println(names.get(i));

    }

}
