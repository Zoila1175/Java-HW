package Class20;

public class Parent {
    void getMarry(){
        System.out.println("Marry to the girl of our choice");
    }
private void accessBank(){
    System.out.println("Accessing bank");
    }
   // static void printNumber(){ does not work to override
       // System.out.println(20);
    }
class Axel extends Parent {

    @Override
    void getMarry() {
        super.getMarry();
        System.out.println("I want to marry Karol G");
    }
}
class ParentTester{
public static void main(String[] args) {
        Axel axel=new Axel ();
        axel.getMarry();

    }
}