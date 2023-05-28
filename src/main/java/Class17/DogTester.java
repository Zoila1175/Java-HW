package Class17;

public class DogTester {
    public static void main(String[] args) {
        Dog dog1=new Dog("Jack", "blank","Persian", 12);
        Dog dog2=new Dog("Coco", "black and gold", "German Shepperd", 3);
        Dog dog3=new Dog("Yani","black","GS",2);
        Dog dog4=new Dog("Darky","brown","labrador",5);
        Dog dog5=new Dog("Dalila","white", "golden retriever",18);
        dog1.printInfo();
        dog2.printInfo();
        dog3.printInfo();
        dog4.printInfo();
        dog5.printInfo();
}
}

//A constructor is a special method tht is automatically called when an object
