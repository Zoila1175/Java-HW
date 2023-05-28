package Class21;

public class E1Poly {
    public static void main(String[] args) {
        Animal[]animals={new Dog("Kantoor","black","German"),
            new Cat("Garfield","brown","Italian"),
            new Horse("Kal","Black","Turkish")};
        for(Animal animal:animals){
            animal.speak();
            animal.eat();
            animal.sleep();
        }
        Animal dogStoredInAnimal=new Dog("Kantoor","black","German");
        //We must type cast the animal back to a dog to call the run method as this run
        //method only exits in the Dog class.
        Dog d=(Dog)dogStoredInAnimal;
        d.run();
        //direct way w/o using a variable
        ((Dog)dogStoredInAnimal).run();

    }
}
