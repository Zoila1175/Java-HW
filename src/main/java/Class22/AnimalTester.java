package Class22;

public class AnimalTester {
    public static void main(String[] args) {
        Animal[]animals={new Dog("Coco", "brown","German"),
                new Cat("Garfield","white","Persian"),
                new Horse("Bronco","black","Turkish")};
        for(Animal animal:animals){
            animal.eat();
            animal.breed();
            animal.speak();
        }
    }
}
