package Class23;
import java.util.ArrayList;
public class E2Collections {
    public static void main(String[] args) {
        ArrayList<String>names=new ArrayList<>();
        names.add("Maria");
        names.add("Kate");
        names.add("Eily");
        names.add("Hazel");
        names.add("Celia");
        System.out.println(names);
        System.out.println(names.size());
        System.out.println(names.contains("Kate"));
        System.out.println(names.contains("Sarah"));
        System.out.println(names.get(0));
        names.remove("Maria");
        System.out.println(names);
    }
}
