package Class22;
/*create 3 animals like Dog Cat and Horse
    define 3 common methods in each class like speak eat and sleep.
    create the object of all the classes and call the methods.*/
public abstract class Animal {
    String name;
    String color;
    String breed;

    Animal(String name, String color, String breed) {
        this.name = name;
        this.color = color;
        this.breed = breed;
    }
        abstract void speak();
        abstract void eat();
        abstract void breed();
        void printInfo(){
            System.out.println(name+" "+color+" "+ breed);
        }
    }
        class Dog extends Animal{
        public Dog(String name, String color, String breed){
            super(name,color,breed);}
            @Override
            void speak(){
                System.out.println("Woof, woof....");
            }
            @Override
            void eat(){
                System.out.println("Chewing bones");
            }
            void breed() {
                System.out.println("Different types");
            }
    }
    class Cat extends Animal{
        public Cat(String name, String color, String breed){
            super(name, color, breed);}
        void speak(){
            System.out.println("Meow meow.....");
        }
        @Override
        void eat(){
            System.out.println("Cats like to eat fish");
        }
        @Override
        void breed(){
            System.out.println("Many types");
        }
    }
    class Horse extends Animal {
        public Horse(String name,String color, String breed){super(name, color, breed);
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
        void breed(){
            System.out.println("Very expensive ones");
        }
        }

