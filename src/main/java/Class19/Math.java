package Class19;

public class Math {
    static void add(int num1, int num2){
        System.out.println(num1+num2);
    }
    static void add(int num1,double num2){
        System.out.println(num1+num2);
    }
    static void add(double num1,double num2){
        System.out.println(num1+num2);
    }
    static void add(long num1,double num2){
        System.out.println(num1+num2);
    }
    static void add(long num1,long num2){
        System.out.println(num1+num2);
    }
    static void add(int num1,float num2, int num3){
        System.out.println(num1+num2+num3);
    }
    public static void main(String[] args) {
        add(10, 20);
        add(10, 20.5);
        add(10.5, 10.5);
        add(111111111111L, 222222222L);

    }
    }