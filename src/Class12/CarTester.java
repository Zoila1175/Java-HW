package Class12;

public class CarTester {
    public static void main(String[] args) {
        Car car=new Car();
        car.make="Toyota";
        car.model="Camry";
        car.price=23000;
        car.miles=230;
        car.turn();
        car.starCar();
        car.stopCar();

        Car car1=new Car();
        car1.make="Tesla";
        car1.model="s";
        car1.miles=0;
        car1.starCar();
        car1.stopCar();
        }

    }

