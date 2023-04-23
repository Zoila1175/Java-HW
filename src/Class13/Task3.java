package Class13;

public class Task3 {
    public static void main(String[] args) {
        //replace all a-z or A-Z
        String str="njkaSDFDFD12349@#$%!";
        String str1=str.replaceAll("[^a-zA-Z]", "");
        System.out.println(str1);
        System.out.println(str1.length());
    }
}
