package Class13;

public class E3StringDemo {
    public static void main(String[] args) {
        String str="dfdSDRTGuurdb    9764d#$%^&@#$";
//Don't replace (^) letters a-z
        System.out.println(str.replaceAll("[^a-z]",""));
        //Don't replace (^) a-z and 0-9
        System.out.println(str.replaceAll("[^a-z0-9]",""));
        System.out.println(str.replaceAll("[duf]",""));
        System.out.println(str.replaceAll("[A-Z]","\\$"));
        System.out.println(str.replaceAll(" ","\\$"));


    }
}
