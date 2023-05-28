package Class20;
//Create 3 animal classes(Dog,Cat,Horse) create 5 methods in each class. create
//3 fields and constructors as well in each class. Create the object of all 3 classes
//and call 2 methods from each class. Yuo must use inheritance to avoid code duplication
public class Animal {
    String name;
    String color;
    int age;

    public Animal(String name, String color, String breed, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public Animal(String name, String color, int age) {
    }

    void sleep() {
        System.out.println("ZZZzzzzzZZZZZ");
    }
    void eat() {
        System.out.println("eating");
    }
    void speak(){
        System.out.println("speaking");
    }
}
class Dog extends Animal{
    Dog(String name, String color, int age){
        super(name, color, age);
    }
@Override
    void sleep(){
        System.out.println("I like to sleep for 10.6 hrs a day");
    }
}
class Cat extends Animal{
    Cat(String name, String color, int age){super(name, color, age);}
}
class Horse extends Animal{
    Horse(String name, String color, int age){super(name, color, age);}
}


