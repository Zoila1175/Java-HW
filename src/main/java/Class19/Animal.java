package Class19;
//Create 3 classes like Dog, Cat, Horse define 5 properties (use default access level).
//You can use inheritance to avoid code duplication.
//Create one printInfo method that will print the values of these variables.
//Create constructors as well in each child class to initialize those
//properties, create on
public class Animal {
    String name;
    String color;
    String breed;
    int age;
    int weight;

    public Animal(String name, String color, String breed, int age, int weight) {
        this.name = name;
        this.color = color;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }
    void printInfo() {
        System.out.println(name + " " + color + " " + breed + " " + age + " " + weight);
    }
}
class Dog extends Animal{
double price;
        public Dog(String name, String color, String breed, int age, int weight, double price) {
            super(name, color, breed, age, weight);
            this.price=price;//if you want to add something
        }
        void printInfo(){
            super.printInfo();
            System.out.println(price);
        }
    }
class Cat extends Animal{

    public Cat(String name, String color, String breed, int age, int weight) {
        super(name, color, breed, age, weight);
    }
}
    class Horse extends Animal {
        public Horse(String name, String color, String breed, int age, int weight) {
            super(name, color, breed, age, weight);
        }
    }

            class AnimalTester {
                public static void main(String[] args) {
                    Dog dog=new Dog("Coco", "gold", "GS", 3, 62, 2500.5);
                    dog.printInfo();
                    Cat cat=new Cat("Garfield", "Orange","Persian",5,15);
                    cat.printInfo();
                    Horse horse=new Horse("Bronco","Black","Arabian", 10, 150);
                    horse.printInfo();
            }
        }




