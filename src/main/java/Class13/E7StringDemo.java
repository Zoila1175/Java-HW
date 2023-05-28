package Class13;

public class E7StringDemo {
    public static void main(String[] args) {
        //String builder is good when you're changing the string frequently
        //String is slower but uses less space, StringBuilder is faster and uses more space
        String name="Marina";
        String name1="Abdul";
        String name2="Brett";
        String country="USA";
        String country2="USA";
        String country3="USA";

        StringBuilder country4= new StringBuilder("USA");
        StringBuilder country5= new StringBuilder("USA");
        StringBuilder country6= new StringBuilder("USA");

        String str="1";
        for(int i=0; i<100; i++){
            str+=i;
        }

    }
}
