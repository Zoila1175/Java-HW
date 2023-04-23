package Class13;

public class Task4 {
    public static void main(String[] args) {
        String str="Is it Saturday? Is it raining? Do we have a Java class todas?";
        String[] strArr=str.split("[.!?]");
        System.out.println(strArr.length);
    }
}
