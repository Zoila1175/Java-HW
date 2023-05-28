package GroupProject2;

public class CarTest {
    public static void main(String[] args) {
        Sedan sedan = new Sedan(20000, "Red", 25);
        System.out.println("Sale price of the sedan: $" + sedan.calculateSalePrice());

        Truck truck = new Truck(50000, "Blue", 3000);
        System.out.println("Sale price of the truck: $" + truck.calculateSalePrice());
    }
}


