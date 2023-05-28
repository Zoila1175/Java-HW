package Class17;

public class Cat {
    String name;
    String color;
    Cat(String catName){
        name=catName;
        System.out.println("1 Argument constructor called");
    }
    Cat (){
        System.out.println("0 constructor called");
    }
    Cat (int age) {
        System.out.println("Int constructor called");
    }
        Cat (double weight){
            System.out.println(" double constructor is called");

    }

    void printInfo(){
        System.out.println(name);
    }

    public static void main(String[] args) {
        String color;
       //System.out.println(color);
        Cat cat=new Cat("Tanji");
        cat.printInfo();

    }
}
