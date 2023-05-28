package GroupProject2;

public class TestShape {
    public static void main(String[] args) {
        Circle circle=new Circle(5);
        System.out.println("Circle area: "+circle.calculateArea());
        System.out.println("Circle perimeter: "+circle.calculatePerimeter());
    }
}
