package Class21;
public class Animal {
    String name;
    String color;
    String breed;

    Animal(String name, String color, String breed) {
        this.name = name;
        this.color = color;
        this.breed = breed;
    }
    void printInfo() {
        System.out.println(name + " " + color + " " + breed);
    }
    void speak(){
        System.out.println("Animals speak");
    }
    void sleep(){
        System.out.println("Animals sleep from 1-20 hours a day");
    }
    void eat(){
        System.out.println("Animals eat many different things");
    }
}
class Cat extends Animal{
    public Cat(String name, String color, String breed){ super(name, color, breed);}
    @Override
    void speak(){
        System.out.println("Meow meow.....");
    }
    @Override
    void eat(){
        System.out.println("Cats like to eat fish");
    }
    @Override
    void sleep(){
        System.out.println("Cats like to sleep 15 hours on average");
    }
}
class Dog extends Animal {
    public Dog(String name, String color, String breed) {
        super(name, color, breed);
    }
    @Override
    void speak(){
        System.out.println("woof, woof");
    }
    @Override
    void sleep(){
        System.out.println("Dogs sleep 8 hours");
    }
    void run(){
        System.out.println("Dogs can run fast");
    }
    @Override
    void eat(){
        System.out.println("Dogs like to chew bones");
    }
}
class Horse extends Animal{
    public Horse(String name,String color, String breed){

        super(name, color, breed);

    }
    @Override
    void speak(){
        System.out.println("neigh, neigh");
    }
    @Override
    void eat(){
        System.out.println("Horses like carrots and grass");
    }
    @Override
    void sleep(){
        System.out.println("Horses sleep 2-3 hours");
    }
}
class AnimalTester {
    public static void main(String[] args) {
        Dog dog = new Dog("Shaggy", "black", "German");
        dog.printInfo();
//Parent class variables can store the objects of the child classes
        Animal dog1=new Dog("Shaggy","black","German");
        dog1.printInfo();
        Animal[]animals={new Dog("Shaggy","black","German"),new Cat("Tom",
                "Blue","Persian")};
        for(Animal animal:animals){
            animal.printInfo();
        }
    }
}


